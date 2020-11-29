package org.dlj.smartparking.repository;

import org.dlj.smartparking.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

    @Query("SELECT t FROM Sensor t WHERE t.uuid = ?1 AND t.password = ?2")
    Sensor findByCredentials(String uuid, String password);
}
