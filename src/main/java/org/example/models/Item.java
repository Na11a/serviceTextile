package org.example.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(of={"name","price","material"})
@FieldDefaults(level= AccessLevel.PROTECTED)
public abstract class Item {
    String name;
    Integer price;
    Material material;
    Country country;
    Integer code;
    Category category;
}
