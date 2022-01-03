package com.miramontes.four.linkin.becomespringdev.a.repositories;

import com.miramontes.four.linkin.becomespringdev.a.model.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
