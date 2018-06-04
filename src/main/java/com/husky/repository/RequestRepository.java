package com.husky.repository;

import com.husky.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Luis on 04/06/2018.
 */
public interface RequestRepository extends JpaRepository<Request, Long>{
}
