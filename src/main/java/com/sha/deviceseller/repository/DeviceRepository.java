package com.sha.deviceseller.repository;

import com.sha.deviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeviceRepository extends JpaRepository<Device,Long> {


}
