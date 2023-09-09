package com.example.horder.services;

import com.example.horder.models.Guitar;
import com.example.horder.models.TopImage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopImageService {
    public TopImage create(TopImage image);
    public List<TopImage> viewAll();
    public TopImage viewById(long id);
    public TopImage findOneByGuitar(Guitar guitar);
}
