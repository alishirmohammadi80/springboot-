
package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author RASHA
 */
@Service
public class itemsService {
    public List<Items>getAll(){
  ArrayList<Items> items=new ArrayList<>();
     items.add(new Items(1, "ali", 99.99, 10));
        items.add(new Items(2, "amir", 99.99, 5));  
          items.add(new Items(1, "omid", 250.0, 6));
          return items;
    }
}