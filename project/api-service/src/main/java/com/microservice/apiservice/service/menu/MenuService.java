package com.microservice.apiservice.service.menu;

import com.microservice.apiservice.entity.Log.LogData;
import com.microservice.apiservice.entity.menu.Menu;
import com.microservice.apiservice.repository.menu.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private RestTemplate restTemplate;

    private String uri = "http://elasticsearch:9200/logs/logs";

    public Menu saveStore(Menu menu) {

        restTemplate.postForEntity(uri, new LogData("menu", "create"), String.class);

        return menuRepository.save(menu);
    }

    public List<Menu> findAllByMenuStoreId(Long storeId) {

        return menuRepository.findAllByMenuStoreId(storeId);
    }

    public Menu updateMenu(Menu menu) {

        restTemplate.postForEntity(uri, new LogData("menu", "update"), String.class);

        return menuRepository.save(menu);
    }
}
