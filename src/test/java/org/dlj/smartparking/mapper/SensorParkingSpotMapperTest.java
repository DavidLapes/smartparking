package org.dlj.smartparking.mapper;

import org.dlj.smartparking.Data;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;
import org.junit.Test;

public class SensorParkingSpotMapperTest {

    private static final SensorParkingSpotMapper MAPPER = SensorParkingSpotMapper.getInstance();

    @Test
    public void mapToParkingSpotDTO() {
        final SensorParkingSpotDTO source = getSensorParkingSpotDTO();
        final ParkingSpotDTO target = MAPPER.map(source);

        assertEquals(source, target);
    }

    private SensorParkingSpotDTO getSensorParkingSpotDTO() {
        return Data.getSensorParkingSpot();
    }

    private void assertEquals(final SensorParkingSpotDTO source, final ParkingSpotDTO target) {
        MapperTestHelper.assertEquals(source, target);
    }
}
