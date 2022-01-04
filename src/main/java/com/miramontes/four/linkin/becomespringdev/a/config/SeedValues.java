package com.miramontes.four.linkin.becomespringdev.a.config;

import com.miramontes.four.linkin.becomespringdev.a.model.Difficulty;
import com.miramontes.four.linkin.becomespringdev.a.model.Region;
import com.miramontes.four.linkin.becomespringdev.a.services.TourPackageService;
import com.miramontes.four.linkin.becomespringdev.a.services.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedValues implements CommandLineRunner {

    private final TourPackageService tourPackageService;
    private final TourService tourService;

    @Autowired
    public SeedValues(TourPackageService tourPackageService, TourService tourService) {
        this.tourPackageService = tourPackageService;
        this.tourService = tourService;
    }


    @Override
    public void run(String... args) throws Exception {
        createTourPackages();
        createTours();
    }

    private void createTours(){
        // title | description | blurb | price | duration | keywords | tourPackageName | difficulty | region
            tourService.createTour("title1", "description1", "blurb1", 1, "duration1", "keywords1", "BC", Difficulty.Easy, Region.Central_Coast);
        tourService.createTour("title2", "description2", "blurb2", 2, "duration2", "keywords2", "CC", Difficulty.Medium, Region.Northern_California);
        tourService.createTour("title3", "description3", "blurb3", 3, "duration3", "keywords3", "CH", Difficulty.Difficult, Region.Varies);
        tourService.createTour("title4", "description4", "blurb4", 4, "duration4", "keywords4", "CY", Difficulty.Varies, Region.Southern_California);
    }

    private void createTourPackages(){
        tourPackageService.createTourPackage("BC","Back pack cal");
        tourPackageService.createTourPackage("CC","California Calm");
        tourPackageService.createTourPackage("CH","California Hot Springs");
        tourPackageService.createTourPackage("CY","Cycle California");
        tourPackageService.createTourPackage("DS","From Desert to Sea");
        tourPackageService.createTourPackage("KC","Kids California");
        tourPackageService.createTourPackage("NW","Nature Watch");
        tourPackageService.createTourPackage("SC","Snowboard Cali");
        tourPackageService.createTourPackage("TC","Taste of California");
    }
}
