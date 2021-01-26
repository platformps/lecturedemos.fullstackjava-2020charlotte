package com.github.curriculeon.arcade.slots;

/**
 * Created by leon on 7/29/2020.
 */
public enum ReelImage {
    CHERRY(500),
    LEMON(750),
    SEVEN(1000),
    DIAMOND(9999);

    private final Integer valueOfImage;

    ReelImage(Integer valueOfImage) {
        this.valueOfImage = valueOfImage;
    }

    public Integer getValueOfImage() {
        return valueOfImage;
    }
}
