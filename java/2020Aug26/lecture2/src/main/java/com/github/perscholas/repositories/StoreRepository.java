package com.github.perscholas.repositories;

import com.github.perscholas.models.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leon on 8/26/2020.
 */
@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {
}
