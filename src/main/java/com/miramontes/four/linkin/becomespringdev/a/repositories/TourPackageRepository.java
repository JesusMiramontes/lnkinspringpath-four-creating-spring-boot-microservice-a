package com.miramontes.four.linkin.becomespringdev.a.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends CrudRepository<TourRepository, String> {
}
