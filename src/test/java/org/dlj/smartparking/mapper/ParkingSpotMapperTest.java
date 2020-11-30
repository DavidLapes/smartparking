package org.dlj.smartparking.mapper;

import org.dlj.smartparking.Data;
import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.junit.Test;

public class ParkingSpotMapperTest {

    private static final ParkingSpotMapper MAPPER = ParkingSpotMapper.getInstance();

    @Test
    public void mapToDTO() {
        final ParkingSpot source = getParkingSpot();
        final ParkingSpotDTO target = MAPPER.map(source);

        assertEquals(source, target);
    }

    @Test
    public void mapFromDTO() {
        final ParkingSpotDTO source = getParkingSpotDTO();
        final ParkingSpot target = MAPPER.map(source);

        assertEquals(source, target);
    }

    private ParkingSpot getParkingSpot() {
        final ParkingSpot parkingSpot = Data.getParkingSpot();
        parkingSpot.setSensor(Data.getSensor());
        return parkingSpot;
    }

    private ParkingSpotDTO getParkingSpotDTO() {
        final ParkingSpotDTO parkingSpot = Data.getParkingSpotDTO();
        parkingSpot.setSensorUuid(Data.getSensorDTO().getUuid());
        return parkingSpot;
    }

    private void assertEquals(final ParkingSpot source, final ParkingSpotDTO target) {
        MapperTestHelper.assertEquals(source, target);
    }

    private void assertEquals(final ParkingSpotDTO source, final ParkingSpot target) {
        MapperTestHelper.assertEquals(source, target);
    }
}
