package org.example.manager;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.models.Item;
import org.example.models.Material;

import java.util.ArrayList;
import java.util.Comparator;


@Data
@AllArgsConstructor
@ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ShopManager {
    @NonNull ArrayList<Item> goods;

    public final ArrayList<Item> searchByPrice(final int price) {
        ArrayList<Item> output = new ArrayList<Item>();
        for (Item item: this.goods){
            if (item.getPrice() == price) output.add(item);
        }
        return output;
    }
    public final ArrayList<Item> searchByMaterial(final Material material){
        ArrayList<Item> output = new ArrayList<Item>();
        for (Item item: this.goods){
            if (item.getMaterial() == material) output.add(item);
        }
        return output;
    }
    public final void sortByWidth(final SortOrder order) {
        if (order == SortOrder.ASC) {
            this.goods.sort(Comparator.comparingInt(Item::getPrice));
        } else {
            this.goods.sort((item1, item2) -> item2.getPrice() - item1.getPrice());
        }
    }

}
