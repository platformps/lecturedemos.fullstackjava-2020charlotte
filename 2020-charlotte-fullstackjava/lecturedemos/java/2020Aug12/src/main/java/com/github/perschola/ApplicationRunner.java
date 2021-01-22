package com.github.perschola;

import com.github.perschola.service.ItemContainerInterface;
import com.github.perschola.service.ShoppingCartService;
import com.github.perschola.service.ShoppingStoreService;
import com.github.perschola.utils.IOConsole;

import java.util.Arrays;

public class ApplicationRunner implements Runnable {
    IOConsole ioConsole = new IOConsole();
    ItemContainerInterface groceryStore = (ItemContainerInterface) new ShoppingStoreService();
    ItemContainerInterface cart = (ItemContainerInterface) new ShoppingCartService();

    public void run() {
        UserAction userAction;
        do {
            userAction = UserAction.getValueOf(getMainMenuInput().toUpperCase());
            userAction.perform(groceryStore, cart);
        }while (!UserAction.QUIT.equals(userAction));
    }

    private String getMainMenuInput() {
        return ioConsole.getStringInput(new StringBuilder()
                .append("Welcome to the main menu.")
                .append("\nFrom here, you can select any of the following actions:\n\t")
                .append(Arrays
                        .toString(UserAction.values())
                        .replaceAll("_", "-"))
                .toString());
    }
}
