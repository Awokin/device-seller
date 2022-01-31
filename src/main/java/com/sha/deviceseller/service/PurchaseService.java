package com.sha.deviceseller.service;

import com.sha.deviceseller.model.Purchase;
import com.sha.deviceseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
