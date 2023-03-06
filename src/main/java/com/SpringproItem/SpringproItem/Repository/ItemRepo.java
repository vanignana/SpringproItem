package com.SpringproItem.SpringproItem.Repository;

import com.SpringproItem.SpringproItem.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Integer> {
}
