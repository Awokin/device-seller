package com.sha.deviceseller.service;

import com.sha.deviceseller.model.Purchase;
import com.sha.deviceseller.repository.PurchaseRepository;
import com.sha.deviceseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

//    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
//        this.purchaseRepository = purchaseRepository;
//    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }

}
