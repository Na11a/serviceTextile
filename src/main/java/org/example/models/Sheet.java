package org.example.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sheet extends Liners{
    String color;
    int width;
    int length;

    @Builder(builderMethodName = "sheetBuilder")
    public Sheet(String name, Integer price, Material material, Country country, Integer code, Category category, String design, int pillowcases,String color,int width,int length) {
        super(name, price, material, country, code, category, design, pillowcases);
        this.color = color;
        this.width = width;
        this.length = length;
    }

}
