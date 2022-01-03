package com.miramontes.four.linkin.becomespringdev.a.services;

import com.miramontes.four.linkin.becomespringdev.a.model.*;
import com.miramontes.four.linkin.becomespringdev.a.repositories.TourPackageRepository;
import com.miramontes.four.linkin.becomespringdev.a.repositories.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    private final TourRepository tourRepository;
    private final TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration, String keywords, String tourPackageName, Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName).orElseThrow(() -> new RuntimeException("Tour package " + tourPackageName + " does not exist."));

        return tourRepository.save(new Tour(title, description, blurb, price, duration, keywords, tourPackage, difficulty, region));
    }

    public long total(){
        return tourRepository.count();
    }
}
