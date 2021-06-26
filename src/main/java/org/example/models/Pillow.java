package org.example.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@SuppressWarnings("checkstyle:WhitespaceAround")
@Data
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pillow extends Liners {
    int width;
    int height;
    int length;
    PillowForms form;
    String color;

    @Builder (builderMethodName = "pillowBuilder")
    public Pillow(String name, Integer price, Material material, Country country, Integer code, Category category, String design, int pillowcases,int width,int height,PillowForms form,int length,String color) {
        super(name, price, material, country, code, category, design, pillowcases);
        this.width = width;
        this.height = height;
        this.length = length;
        this.form = form;
        this.color = color;
    }
}

