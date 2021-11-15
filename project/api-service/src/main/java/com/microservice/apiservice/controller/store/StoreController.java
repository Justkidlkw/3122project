package com.microservice.apiservice.controller.store;

import com.microservice.apiservice.entity.store.Store;
import com.microservice.apiservice.service.store.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;


    @PostMapping("/create")
    public Store createStore(@RequestBody Store store) {
        return  storeService.saveStore(store);
    }

    @GetMapping("/{id}")
    public Store findByStoreId(@PathVariable("id") Long storeId) {
        return storeService.findByStoreId(storeId);
    }

    @GetMapping("/all")
    public List<Store> findAll() {
        return storeService.findAll();
    }

    @PostMapping("/update")
    public Store updateStore(@RequestBody Store store) {
        return  storeService.updateStore(store);
    }
}
