package com.sha.deviceseller.repository.projection;

import com.sha.deviceseller.model.DeviceType;
//import org.joda.time.LocalDateTime;

import java.time.LocalDateTime;

public interface PurchaseItem {

    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();

}
