package com.SpringproItem.SpringproItem.Service;

import com.SpringproItem.SpringproItem.Entity.Item;
import com.SpringproItem.SpringproItem.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public Item saveDetails(Item item){
        return itemRepo.save(item);
    }

    public List<Item> getAllDetails()
    {
        return itemRepo.findAll();
    }

}
