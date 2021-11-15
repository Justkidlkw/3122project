package com.microservice.apiservice.repository.menu;

import com.microservice.apiservice.entity.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByMenuStoreId(Long storeId);
}
