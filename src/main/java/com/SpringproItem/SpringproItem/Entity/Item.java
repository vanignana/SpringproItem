package com.SpringproItem.SpringproItem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Item_DB")
@NoArgsConstructor
@AllArgsConstructor

public class Item {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;

    @Column(name = "Item Name")
    private String name;

    @Column(name = "Item Price")
    private int price;

}
