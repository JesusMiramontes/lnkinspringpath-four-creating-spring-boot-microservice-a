package com.miramontes.four.linkin.becomespringdev.a.services;

import com.miramontes.four.linkin.becomespringdev.a.model.TourPackage;
import com.miramontes.four.linkin.becomespringdev.a.repositories.TourPackageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private final TourPackageRepository tourPackageRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(TourPackageService.class);

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
        LOGGER.debug("Created tourPackageService.");
    }

    public TourPackage createTourPackage(String code, String name){
        LOGGER.info("Creating tour package. Code: " + code + " name: " + name);
        return tourPackageRepository.findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total(){
        return tourPackageRepository.count();
    }
}
