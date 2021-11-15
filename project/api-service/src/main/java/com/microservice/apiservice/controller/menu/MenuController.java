package com.microservice.apiservice.controller.menu;

import com.microservice.apiservice.entity.menu.Menu;
import com.microservice.apiservice.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/create")
    public Menu createMenu(@RequestBody Menu menu) {
        return  menuService.saveStore(menu);
    }

    @GetMapping("/{id}")
    public List<Menu> findAllByMenuStoreId(@PathVariable("id") Long storeId) {
        return menuService.findAllByMenuStoreId(storeId);
    }

    @PostMapping("/update")
    public Menu updateMenu(@RequestBody Menu menu) {
        return  menuService.updateMenu(menu);
    }
}
