package com.github.perschola;

import com.github.perschola.model.Item;
import com.github.perschola.model.ItemInterface;
import com.github.perschola.service.ItemContainerInterface;
import com.github.perschola.utils.IOConsole;

import java.util.function.BiConsumer;

/**
 * Created by leon on 8/12/2020.
 */
public enum UserAction {
    ADD_TO_SYSTEM((groceryStore, cart) -> {
        IOConsole ioConsole = new IOConsole();
        String itemName = ioConsole.getStringInput("Enter the name of the item");
        String itemDescription = ioConsole.getStringInput("Enter the description of the item");
        Double itemPrice = ioConsole.getDoubleInput("Enter the price of the item");
        Integer itemQuantity = ioConsole.getIntegerInput("Enter the quantity available in the system");

        ItemInterface item = (ItemInterface) new Item();
        item.setItemName(itemName);
        item.setItemDesc(itemDescription);
        item.setItemPrice(itemPrice);
        item.setAvailableQuantity(itemQuantity);
        groceryStore.add(item);
        ioConsole.println("%s successfully added", itemName);
    }),

    ADD_TO_CART((groceryStore, cart) -> {
        IOConsole ioConsole = new IOConsole();
        String itemName = ioConsole.getStringInput("Enter the name of the item");
        ItemInterface item = groceryStore.get(itemName);
        if (item != null) {
            cart.add(item);
            ioConsole.println("%s successfully added", itemName);
        } else {
            ioConsole.println("%s is not currently in stock", itemName);
        }
    }),

    REMOVE_FROM_CART((groceryStore, cart)-> {
        IOConsole ioConsole = new IOConsole();
        String itemName = ioConsole.getStringInput("Enter the name of the item to be removed from the cart.");
        ItemInterface item = cart.get(itemName);
        if (item != null) {
            cart.remove(itemName);
            ioConsole.println("%s was removed from cart", itemName);

            groceryStore.add(item);
            ioConsole.println("%s was stocked back in inventory", itemName);
        } else {
            ioConsole.println("%s is not an item in your cart", itemName);
        }
    }),

    REMOVE_FROM_SYSTEM((groceryStore, cart)-> {
        IOConsole ioConsole = new IOConsole();
        String itemName = ioConsole.getStringInput("Enter the name of the item to be removed from the system.");
        ItemInterface item = groceryStore.get(itemName);
        if (item != null) {
            cart.remove(itemName);
            ioConsole.println("%s was removed from cart", itemName);

            groceryStore.remove(item);
            ioConsole.println("%s was removed inventory", itemName);
        } else {
            ioConsole.println("%s is not an item in the system", itemName);
        }
    }),
    DISPLAY_CART((groceryStore, cart) -> cart.display()),
    DISPLAY_SYSTEM((groceryStore, cart)-> groceryStore.display()),
    QUIT((groceryStore, cart) -> new IOConsole().println("Bye!"));


    private BiConsumer<ItemContainerInterface, ItemContainerInterface> operationToBeRan;

    UserAction(BiConsumer<ItemContainerInterface, ItemContainerInterface> operationToBeRan) {
        this.operationToBeRan = operationToBeRan;
    }

    public static UserAction getValueOf(String toUpperCase) {
        return valueOf(toUpperCase
                .replaceAll("-", "_")
                .toUpperCase());
    }

    public void perform(ItemContainerInterface groceryStore, ItemContainerInterface cart) {
        operationToBeRan.accept(groceryStore, cart);
    }
}
