package com.ibwd.app.swerve.data.repositories;

import com.ibwd.app.swerve.data.entities.SeasonEntity;
import org.springframework.data.repository.CrudRepository;

public interface SeasonRepository extends CrudRepository<SeasonEntity, Long> {

    SeasonEntity findBySeason(Integer seasonYear);
}
