package com.example.horder.services;

import com.example.horder.models.Guitar;
import com.example.horder.models.TopImage;
import com.example.horder.repository.TopImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopImageServiceImpl implements TopImageService{
    @Autowired
    private TopImageRepository imageRepository;

    @Override
    public TopImage create(TopImage image) {
        return imageRepository.save(image);
    }
    @Override
    public List<TopImage> viewAll() {
        return (List<TopImage>) imageRepository.findAll();
    }
    @Override
    public TopImage viewById(long id) {
        return imageRepository.findById(id).get();
    }
    @Override
    public TopImage findOneByGuitar(Guitar guitar){return imageRepository.findOneByGuitar(guitar);}

}
