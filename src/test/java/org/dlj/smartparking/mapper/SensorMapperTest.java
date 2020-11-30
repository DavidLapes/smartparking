package org.dlj.smartparking.mapper;

import org.dlj.smartparking.Data;
import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.model.Sensor;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SensorMapperTest {

    private static final SensorMapper MAPPER = SensorMapper.getInstance();

    @Test
    public void mapToDTO() {
        final Sensor source = getSensor();
        final SensorDTO target = MAPPER.map(source);

        assertEquals(source, target);
    }

    @Test
    public void mapFromDTO() {
        final SensorDTO source = getSensorDTO();
        final Sensor target = MAPPER.map(source);

        assertEquals(source, target);
    }

    private Sensor getSensor() {
        final Sensor sensor = Data.getSensor();
        final List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            final ParkingSpot parkingSpot = Data.getParkingSpot();
            parkingSpot.setSensor(sensor);
            parkingSpots.add(parkingSpot);
        }
        sensor.setParkingSpots(parkingSpots);
        return sensor;
    }

    private SensorDTO getSensorDTO() {
        final SensorDTO sensor = Data.getSensorDTO();
        final List<ParkingSpotDTO> parkingSpots = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            final ParkingSpotDTO parkingSpot = Data.getParkingSpotDTO();
            parkingSpot.setSensorUuid(sensor.getUuid());
            parkingSpots.add(parkingSpot);
        }
        sensor.setParkingSpots(parkingSpots);
        return sensor;
    }

    private void assertEquals(final Sensor source, final SensorDTO target) {
        MapperTestHelper.assertEquals(source, target);
        for(int i = 0; i < target.getParkingSpots().size(); i++) {
            final ParkingSpotDTO targetSpot = target.getParkingSpots().get(i);
            final ParkingSpot sourceSpot = source.getParkingSpots().get(i);
            MapperTestHelper.assertEquals(sourceSpot, targetSpot);
        }
    }

    private void assertEquals(final SensorDTO source, final Sensor target) {
        MapperTestHelper.assertEquals(source, target);
        for(int i = 0; i < target.getParkingSpots().size(); i++) {
            final ParkingSpot targetSpot = target.getParkingSpots().get(i);
            final ParkingSpotDTO sourceSpot = source.getParkingSpots().get(i);
            MapperTestHelper.assertEquals(sourceSpot, targetSpot);
        }
    }
}
