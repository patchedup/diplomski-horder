package com.example.horder.dtos;

import com.example.horder.models.Guitar;
import com.example.horder.models.enums.StateOfGuitar;
import com.example.horder.models.enums.TypeOfGuitar;
import com.example.horder.models.enums.TypeOfMagnets;
import jakarta.persistence.*;

public class GuitarDTO {

    private Long id;
    private String manufacturerOfGuitar;
    private Integer yearOfProduction;
    private StateOfGuitar stateOfGuitar;
    private TypeOfGuitar typeOfGuitar;
    private TypeOfMagnets typeOfMagnets;
    private String tuners;
    private String typeOfWood;
    private String description;


    public GuitarDTO(){

    }

    public GuitarDTO(Guitar guitar){
        id = guitar.getId();
        manufacturerOfGuitar = guitar.getManufacturerOfGuitar();
        yearOfProduction = guitar.getYearOfProduction();
        stateOfGuitar = guitar.getStateOfGuitar();
        typeOfGuitar = guitar.getTypeOfGuitar();
        typeOfMagnets = guitar.getTypeOfMagnets();
        tuners = guitar.getTuners();
        typeOfWood = guitar.getTypeOfWood();
        description = guitar.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturerOfGuitar() {
        return manufacturerOfGuitar;
    }

    public void setManufacturerOfGuitar(String manufacturerOfGuitar) {
        this.manufacturerOfGuitar = manufacturerOfGuitar;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public StateOfGuitar getStateOfGuitar() {
        return stateOfGuitar;
    }

    public void setStateOfGuitar(StateOfGuitar stateOfGuitar) {
        this.stateOfGuitar = stateOfGuitar;
    }

    public TypeOfGuitar getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public void setTypeOfGuitar(TypeOfGuitar typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }

    public TypeOfMagnets getTypeOfMagnets() {
        return typeOfMagnets;
    }

    public void setTypeOfMagnets(TypeOfMagnets typeOfMagnets) {
        this.typeOfMagnets = typeOfMagnets;
    }

    public String getTuners() {
        return tuners;
    }

    public void setTuners(String tuners) {
        this.tuners = tuners;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
