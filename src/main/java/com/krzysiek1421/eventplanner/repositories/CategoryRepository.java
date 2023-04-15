package com.krzysiek1421.eventplanner.repositories;

import com.krzysiek1421.eventplanner.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
