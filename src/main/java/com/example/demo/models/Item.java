package com.example.demo.models;

import lombok.Data;
import lombok.NonNull;

@Data
public  class Item {
    Integer id;
    @NonNull String name;
    @NonNull Integer price;
    @NonNull Country country;
    @NonNull Integer code;
    @NonNull Category category;
}