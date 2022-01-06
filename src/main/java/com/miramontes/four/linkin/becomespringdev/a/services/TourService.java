package com.miramontes.four.linkin.becomespringdev.a.services;

import com.miramontes.four.linkin.becomespringdev.a.model.Difficulty;
import com.miramontes.four.linkin.becomespringdev.a.model.Region;
import com.miramontes.four.linkin.becomespringdev.a.model.Tour;
import com.miramontes.four.linkin.becomespringdev.a.model.TourPackage;
import com.miramontes.four.linkin.becomespringdev.a.repositories.TourPackageRepository;
import com.miramontes.four.linkin.becomespringdev.a.repositories.TourRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    private final TourRepository tourRepository;
    private final TourPackageRepository tourPackageRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(TourService.class);

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
        LOGGER.debug("Created TourService");
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration, String keywords, String tourPackageName, Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName).orElseThrow(() -> new RuntimeException("Tour package " + tourPackageName + " does not exist."));

        LOGGER.info("Created tour: " + tourPackage.toString());
        return tourRepository.save(new Tour(title, description, blurb, price, duration, keywords, tourPackage, difficulty, region));
    }

    public long total(){
        return tourRepository.count();
    }
}
