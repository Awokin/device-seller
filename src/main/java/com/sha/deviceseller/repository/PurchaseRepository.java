package com.sha.deviceseller.repository;

import com.sha.deviceseller.model.Purchase;
import com.sha.deviceseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {

    @Query("select " +
            "d.name as name, d.deviceType as type, p.price as price, p.color as color,p.purchaseTime as purchaseTime " +
                "from Purchase p left join Device d on d.id = p.deviceId " +
                "where p.userId = :userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);

}

