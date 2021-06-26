package org.example.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@ToString(callSuper = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public final class Towel extends Item{
    boolean withPrint;
    int set;
    int width;
    int length;

    @Builder
    public Towel(String name,
            Integer price,
            Material material,
            Country country,
            Integer code,
            Category category,
                 boolean withPrint, int width, int length, int set) {
        super(name, price, material, country, code, category);
        this.withPrint = withPrint;
        this.width = width;
        this.length = length;
        this.set = set;
    }
}
