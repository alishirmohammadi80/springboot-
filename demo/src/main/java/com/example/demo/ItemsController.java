
package com.example.demo;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author RASHA
 */


@Controller
@RequestMapping("/inventory")
public class ItemsController {
   @Autowired
   itemsService its;
   @RequestMapping
   public String getAll(Model model){
     List<Items> items=its.getAll();
     model.addAttribute("items",items);
     model.addAttribute("hedind", "my heding");
     
return "ali";
   }
}
