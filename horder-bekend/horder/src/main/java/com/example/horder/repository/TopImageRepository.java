package com.example.horder.repository;

import com.example.horder.models.Guitar;
import com.example.horder.models.TopImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopImageRepository extends CrudRepository<TopImage, Long> {

    TopImage findOneByGuitar(Guitar guitar);
}