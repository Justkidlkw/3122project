package com.microservice.apiservice.repository.store;

import com.microservice.apiservice.entity.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findByStoreId(Long storeId);
}
