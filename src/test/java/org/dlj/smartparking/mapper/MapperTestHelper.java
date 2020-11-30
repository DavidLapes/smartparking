package org.dlj.smartparking.mapper;

import lombok.experimental.UtilityClass;
import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.model.Sensor;
import org.dlj.smartparking.model.SensorType;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorDTO;
import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorTypeDTO;

import static org.assertj.core.api.Assertions.assertThat;

@UtilityClass
public class MapperTestHelper {

    void assertEquals(final Sensor source, final SensorDTO target) {
        assertThat(target.getId()).isEqualTo(source.getId());
        assertThat(target.getUuid()).isEqualTo(source.getUuid());
        assertThat(target.getPassword()).isEqualTo(source.getPassword());
        assertThat(target.getType().name()).isEqualTo(source.getType().name());
    }

    void assertEquals(final SensorDTO source, final Sensor target) {
        assertThat(target.getId()).isEqualTo(source.getId());
        assertThat(target.getUuid()).isEqualTo(source.getUuid());
        assertThat(target.getPassword()).isEqualTo(source.getPassword());
        assertThat(target.getType().name()).isEqualTo(source.getType().name());
    }

    void assertEquals(final ParkingSpot source, final ParkingSpotDTO target) {
        assertThat(target.getId()).isEqualTo(source.getId());
        assertThat(target.getUuid()).isEqualTo(source.getUuid());
        assertThat(target.getSensorUuid()).isEqualTo(source.getSensor().getUuid());
        assertThat(target.getLatitude()).isEqualTo(source.getLatitude());
        assertThat(target.getLongitude()).isEqualTo(source.getLongitude());
        assertThat(target.getAvailable()).isEqualTo(source.getAvailable());
    }

    void assertEquals(final ParkingSpotDTO source, final ParkingSpot target) {
        assertThat(target.getId()).isEqualTo(source.getId());
        assertThat(target.getUuid()).isEqualTo(source.getUuid());
        assertThat(target.getSensor().getUuid()).isEqualTo(source.getSensorUuid());
        assertThat(target.getLatitude()).isEqualTo(source.getLatitude());
        assertThat(target.getLongitude()).isEqualTo(source.getLongitude());
        assertThat(target.getAvailable()).isEqualTo(source.getAvailable());
    }

    void assertEquals(final SensorType source, final SensorTypeDTO target) {
        assertThat(target.name()).isEqualTo(source.name());
    }

    void assertEquals(final SensorTypeDTO source, final SensorType target) {
        assertThat(target.name()).isEqualTo(source.name());
    }

    void assertEquals(final SensorParkingSpotDTO source, final ParkingSpotDTO target) {
        assertThat(target.getUuid()).isEqualTo(source.getParkingSpotUuid());
        assertThat(target.getSensorUuid()).isEqualTo(source.getSensorUuid());
        assertThat(target.getAvailable()).isEqualTo(source.getAvailable());
    }
}
