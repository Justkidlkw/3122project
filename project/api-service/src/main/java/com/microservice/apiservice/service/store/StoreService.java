package com.microservice.apiservice.service.store;

import com.microservice.apiservice.entity.Log.LogData;
import com.microservice.apiservice.entity.store.Store;
import com.microservice.apiservice.repository.store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private RestTemplate restTemplate;

    private String uri = "http://elasticsearch:9200/logs/logs";

    public Store saveStore(Store store) {

        restTemplate.postForEntity(uri, new LogData("menu", "create"), String.class);

        return storeRepository.save(store);
    }

    public Store findByStoreId(Long storeId) {

        return storeRepository.findByStoreId(storeId);
    }

    public List<Store> findAll() {

        return storeRepository.findAll();
    }

    public Store updateStore(Store store) {

        restTemplate.postForEntity(uri, new LogData("menu", "update"), String.class);

        return storeRepository.save(store);
    }
}
