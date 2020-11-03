package org.dlj.smartparking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private Long id;

    @Size(max = 256)
    @NotNull
    private String password;

    @NotNull
    @Column(unique = true, length = 64)
    private String email;

    @Column(
            columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP",
            insertable = false,
            updatable = false
    )
    private Timestamp timeCreated;

    @Column(columnDefinition = "DATETIME")
    private Timestamp timeUpdated;

    @Column(columnDefinition = "DATETIME")
    private Timestamp timeDeleted;
}
