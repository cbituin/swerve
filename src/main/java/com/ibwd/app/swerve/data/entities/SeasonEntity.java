package com.ibwd.app.swerve.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="SEASONS")
@Data

public class SeasonEntity {
    @Id
    @Column(name="SEASON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="SEASON_YEAR")
    private int seasonYear;
}
