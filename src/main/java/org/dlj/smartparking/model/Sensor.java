package org.dlj.smartparking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        name = "sensors",
        indexes = {
                @Index(
                        name = "uuid_index",
                        columnList = "uuid",
                        unique = true),
                @Index(
                        name = "type_index",
                        columnList = "type")
        })
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(
            name = "uuid",
            nullable = false,
            length = 64
    )
    private String uuid;

    @NotNull
    @Column(
            name = "password",
            nullable = false,
            length = 256
    )
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", columnDefinition = "enum('CAMERA', 'MOVEMENT_SENSOR') DEFAULT 'CAMERA'")
    private SensorType type;

    @OneToMany(
            mappedBy = "sensor",
            fetch = FetchType.LAZY
    )
    private List<ParkingSpot> parkingSpots;
}
