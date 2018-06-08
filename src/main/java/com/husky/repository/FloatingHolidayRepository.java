package com.husky.repository;

import com.husky.entity.FloatingHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */

public interface FloatingHolidayRepository extends JpaRepository<FloatingHoliday, Long> {

    /*@Query("SELECT f FROM User u, Request r, FloatingHoliday f WHERE f.user_gender = r.user.gender AND f.user_parent = r.user.isparent AND u.gender = :gender AND u.isparent = :isparent")
    List<FloatingHoliday> findByUserGenderAndUserIsParent(@Param("gender") String gender, @Param("isparent") boolean isparent);*/


}
