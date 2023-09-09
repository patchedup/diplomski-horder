package com.example.horder.dtos;

import com.example.horder.models.Guitar;
import com.example.horder.models.TopImage;

public class ImageDTO {
    private GuitarDTO guitar;
    private Long id;
    private String urlPath;


    public ImageDTO(){

    }

    public ImageDTO(TopImage topImage){
        this.id = topImage.getId();
        this.urlPath = topImage.getUrlPath();
        this.guitar = new GuitarDTO(topImage.getGuitar());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public GuitarDTO getGuitar() {
        return guitar;
    }

    public void setGuitar(GuitarDTO guitar) {
        this.guitar = guitar;
    }
}
