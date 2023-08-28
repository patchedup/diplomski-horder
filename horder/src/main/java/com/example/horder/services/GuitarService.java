package com.example.horder.services;

import com.example.horder.models.Guitar;
import com.example.horder.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuitarService {
    @Autowired
    private GuitarRepository guitarRepository;

    public List<Guitar> findAll(){return guitarRepository.findAll();}

    public Guitar findOne(Long id){return guitarRepository.findById(id).orElseGet(null);}

    public Guitar save(Guitar guitar){
        return guitarRepository.save(guitar);
    }

    public void remove(Long id){
        guitarRepository.deleteById(id);
    }
}
