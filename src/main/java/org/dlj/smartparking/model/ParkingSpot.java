package org.dlj.smartparking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(
        name = "parking_spots",
        indexes = {
                @Index(
                        name = "uuid_index",
                        columnList = "uuid",
                        unique = true),
                @Index(
                        name = "available_index",
                        columnList = "available")
        })
public class ParkingSpot {

    //TODO audit logging
    //TODO add metrics

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "uuid",
            nullable = false,
            length = 64
    )
    private String uuid;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sensor_id", referencedColumnName = "uuid")
    private Sensor sensor;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotNull
    private Boolean available;
}
