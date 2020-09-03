package com.github.perschola.service;

import com.github.perschola.model.ItemInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 8/13/2020.
 */
abstract public class AbstractItemContainer implements ItemContainerInterface {
    private List<ItemInterface> itemList;

    public AbstractItemContainer() {
        this(new ArrayList<>());
    }

    public AbstractItemContainer(List<ItemInterface> itemList) {
        this.itemList = itemList;
    }

    @Override
    public List<ItemInterface> getItemList() {
        return itemList;
    }
}
