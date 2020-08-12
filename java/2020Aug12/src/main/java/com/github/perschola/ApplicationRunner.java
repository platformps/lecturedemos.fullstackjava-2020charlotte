package com.github.perschola;

import com.github.perschola.model.Item;
import com.github.perschola.model.ItemInterface;
import com.github.perschola.service.ShoppingCartService;
import com.github.perschola.service.ShoppingStoreService;
import com.github.perschola.service.ItemContainer;
import com.github.perschola.utils.IOConsole;

public class ApplicationRunner implements Runnable {
    IOConsole ioConsole = new IOConsole();
    ItemContainer groceryStore = (ItemContainer) new ShoppingStoreService();
    ItemContainer cart = (ItemContainer) new ShoppingCartService();

    public void run() {
        Integer choice = 0;
        while (choice != 7) {
            UserAction.valueOf(getMainMenuInput()).perform(groceryStore, cart);
        }
    }

    private String getMainMenuInput() {
        return ioConsole.getStringInput(new StringBuilder()
                .append("Welcome to the main menu.")
                .append("\nFrom here, you can select any of the following actions:\n\t[")
                .append("system, ")
                .append("cart ]")
                .toString());
    }
}
