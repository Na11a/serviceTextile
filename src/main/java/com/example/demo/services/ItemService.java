package com.example.demo.services;

import com.example.demo.models.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class ItemService {
    private  AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Item> itemsMap = new HashMap<>();
    public Item addItem(Item item){
        Integer itemId = id.incrementAndGet();
        item.setId(itemId);
        itemsMap.put(itemId,item);
        return item;
    }
    public Item getItem(int id){
        return itemsMap.get(id);
    }
    public List<Item> getItems(){
        return itemsMap.values().stream().collect(Collectors.toList());
    }
    public Item updateItem(Item item){
        if (itemsMap.get(item.getId()) == null) {
            return null;
        }
        return itemsMap.put(item.getId(),item);
    }
    public Item deleteItem(Integer id){
        return itemsMap.remove(id);

    }
}
