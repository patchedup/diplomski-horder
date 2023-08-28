package com.example.horder.models;

import com.example.horder.models.enums.StateOfGuitar;
import com.example.horder.models.enums.TypeOfGuitar;
import com.example.horder.models.enums.TypeOfMagnets;
import jakarta.persistence.*;

@Entity
@Table(name = "guitars")
public class Guitar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String manufacturerOfGuitar;

    @Column
    private Integer yearOfProduction;

    @Column
    @Enumerated(EnumType.STRING)
    private StateOfGuitar stateOfGuitar;

    @Column
    @Enumerated(EnumType.STRING)
    private TypeOfGuitar typeOfGuitar;

    @Column
    @Enumerated(EnumType.STRING)
    private TypeOfMagnets typeOfMagnets;

    @Column
    private String tuners;

    @Column
    private String typeOfWood;

    @Column
    private String description;

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
