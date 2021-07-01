package com.example.demo.controller;

import com.example.demo.models.Item;
import com.example.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/items")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(path = "/{id}")
    public Item getItem(@PathVariable(name = "id") Integer id){
        return itemService.getItem(id);
    }

    @GetMapping
    public List<Item> getItems(){
        return itemService.getItems();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PutMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Item> updateItem(final @PathVariable(name = "id") Integer id,@RequestBody Item item){
        item.setId(id);
        HttpStatus status = itemService.updateItem(item) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return  ResponseEntity.status(status).build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Item> deleteItem(final @PathVariable(name = "id") Integer id){
        HttpStatus status = itemService.deleteItem(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return  ResponseEntity.status(status).build();
    }
}
