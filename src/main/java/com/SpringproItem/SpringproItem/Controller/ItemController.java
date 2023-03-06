package com.SpringproItem.SpringproItem.Controller;

import com.SpringproItem.SpringproItem.Entity.Item;
import com.SpringproItem.SpringproItem.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public Item postDetails(@RequestBody Item item)
    {
        return itemService.saveDetails(item);
    }
    @GetMapping("/getItem")

    public List<Item> getDetails(){
        return itemService.getAllDetails();
    }
}
