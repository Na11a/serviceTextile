package org.example.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@SuppressWarnings("ALL")
@Data
@ToString(callSuper=true)
@FieldDefaults(level= AccessLevel.PROTECTED)
public class Liners extends Item{
    int pillowcases;
    String design;

    @Builder
    public Liners(String name, Integer price, Material material, Country country, Integer code, Category category,String design,int pillowcases) {
        super(name, price, material, country, code, category);
        this.design=design;
        this.pillowcases=pillowcases;
    }
}
