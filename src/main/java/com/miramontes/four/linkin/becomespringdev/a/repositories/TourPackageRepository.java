package com.miramontes.four.linkin.becomespringdev.a.repositories;

import com.miramontes.four.linkin.becomespringdev.a.model.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    public TourPackage findByName(String name);
}
