package org.dlj.smartparking;

import lombok.experimental.UtilityClass;
import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.model.Sensor;
import org.dlj.smartparking.model.SensorType;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorDTO;
import org.dlj.smartparking.rest.entity.SensorTypeDTO;

import java.util.UUID;

@UtilityClass
public class Data {

    public Long getRandomId() {
        return (long) (Math.random() * 1000);
    }

    public Sensor getSensor() {
        final Sensor data = new Sensor();
        data.setId(getRandomId());
        data.setPassword("password");
        data.setUuid(UUID.randomUUID().toString());
        data.setType(getSensorType());
        return data;
    }

    public SensorDTO getSensorDTO() {
        final SensorDTO data = new SensorDTO();
        data.setId(getRandomId());
        data.setPassword("password");
        data.setUuid(UUID.randomUUID().toString());
        data.setType(getSensorTypeDTO());
        return data;
    }

    public SensorType getSensorType() {
        return SensorType.MOVEMENT_SENSOR;
    }

    public SensorTypeDTO getSensorTypeDTO() {
        return SensorTypeDTO.CAMERA;
    }

    public ParkingSpot getParkingSpot() {
        final ParkingSpot data = new ParkingSpot();
        data.setId(getRandomId());
        data.setUuid(UUID.randomUUID().toString());
        data.setLatitude(Math.random());
        data.setLongitude(Math.random());
        data.setAvailable(false);
        return data;
    }

    public ParkingSpotDTO getParkingSpotDTO() {
        final ParkingSpotDTO data = new ParkingSpotDTO();
        data.setId(getRandomId());
        data.setUuid(UUID.randomUUID().toString());
        data.setLatitude(Math.random());
        data.setLongitude(Math.random());
        data.setAvailable(false);
        return data;
    }

    public SensorParkingSpotDTO getSensorParkingSpot() {
        final SensorParkingSpotDTO data = new SensorParkingSpotDTO();
        data.setSensorUuid(UUID.randomUUID().toString());
        data.setPassword("password");
        data.setParkingSpotUuid(UUID.randomUUID().toString());
        data.setAvailable(true);
        return data;
    }
}
