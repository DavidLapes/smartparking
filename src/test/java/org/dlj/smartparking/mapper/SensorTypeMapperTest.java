package org.dlj.smartparking.mapper;

import org.dlj.smartparking.Data;
import org.dlj.smartparking.model.SensorType;
import org.dlj.smartparking.rest.entity.SensorTypeDTO;
import org.junit.Test;

public class SensorTypeMapperTest {

    private static final SensorTypeMapper MAPPER = SensorTypeMapper.getInstance();

    @Test
    public void mapToDTO() {
        final SensorType source = getSensorType();
        final SensorTypeDTO target = MAPPER.map(source);

        assertEquals(source, target);
    }

    @Test
    public void mapFromDTO() {
        final SensorTypeDTO source = getSensorTypeDTO();
        final SensorType target = MAPPER.map(source);

        assertEquals(source, target);
    }

    private SensorType getSensorType() {
        return Data.getSensorType();
    }

    private SensorTypeDTO getSensorTypeDTO() {
        return Data.getSensorTypeDTO();
    }

    private void assertEquals(final SensorType source, final SensorTypeDTO target) {
        MapperTestHelper.assertEquals(source, target);
    }

    private void assertEquals(final SensorTypeDTO source, final SensorType target) {
        MapperTestHelper.assertEquals(source, target);
    }
}
