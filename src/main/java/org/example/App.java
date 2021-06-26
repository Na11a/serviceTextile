package org.example;
import org.example.manager.ShopManager;
import org.example.manager.SortOrder;
import org.example.models.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Material material1 = new Material("Textile","material1");
        Towel towel1 = new Towel("towel1", 100,
                material1, Country.CHINA, 123,
                Category.TOWEL, true,
                100, 140, 3);
        System.out.println(towel1);
        Liners liners1 = new Liners("towel1",100,
                material1, Country.CHINA, 123,
                Category.LINERS, "Design1",
                2);
        System.out.println(liners1);

        Pillow pillow1 = Pillow.pillowBuilder().
                name("pillow1").price(500).
                pillowcases(5).code(435).
                country(Country.CHINA).material(material1).
                form(PillowForms.CIRCLE).width(80).length(65).
                color("red").design("Bubles").build();
        System.out.println(pillow1);
        ShopManager manager = new ShopManager(new ArrayList<Item>(
                List.of(towel1, liners1, pillow1)
        ));
        System.out.println(manager.searchByPrice(100));
        manager.sortByWidth(SortOrder.DESC);
        System.out.println(manager);
    }
}