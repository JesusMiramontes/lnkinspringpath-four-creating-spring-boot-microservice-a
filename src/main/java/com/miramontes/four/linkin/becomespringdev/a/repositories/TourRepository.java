package com.miramontes.four.linkin.becomespringdev.a.repositories;

import com.miramontes.four.linkin.becomespringdev.a.model.Difficulty;
import com.miramontes.four.linkin.becomespringdev.a.model.Region;
import com.miramontes.four.linkin.becomespringdev.a.model.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {
    List<Tour> findByTitle(String title);
    List<Tour> findByPrice(Integer price);
    Collection<Tour> findByDifficulty(Difficulty difficulty);
    List<Tour> findByRegion(Region region);

    List<Tour> findByTourPackageCodeAndRegion(String code, Region region);
    List<Tour> findByRegionIn(List<Region> regions);
    List<Tour> findByPriceLessThan(Integer maxPrice);
    List<Tour> findByKeywordsContains(String keyword);
}