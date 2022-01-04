package com.miramontes.four.linkin.becomespringdev.a.repositories;

import com.miramontes.four.linkin.becomespringdev.a.model.Difficulty;
import com.miramontes.four.linkin.becomespringdev.a.model.Region;
import com.miramontes.four.linkin.becomespringdev.a.model.Tour;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
    List<Tour> findByTitle(String title);
    List<Tour> findByPrice(Integer price);

    @RestResource(exported = false)
    Collection<Tour> findByDifficulty(Difficulty difficulty);
    List<Tour> findByRegion(Region region);

    List<Tour> findByTourPackageCode(String code, Pageable pageable);
    List<Tour> findByTourPackageCodeAndRegion(String code, Region region);
    List<Tour> findByRegionIn(List<Region> regions);
    List<Tour> findByPriceLessThan(Integer maxPrice);
    List<Tour> findByKeywordsContains(String keyword);

    @Override
    @RestResource(exported = false)
    Iterable<Tour> findAll(Sort sort);

    @Override
    @RestResource(exported = false)
    <S extends Tour> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends Tour> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Tour entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Integer> integers);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Tour> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}