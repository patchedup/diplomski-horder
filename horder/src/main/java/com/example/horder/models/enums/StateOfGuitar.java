package com.example.horder.models.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public enum StateOfGuitar {
    POTREBNA_RESTAURACIJA,
    KORISCENO,
    DOBRO,
    KAO_NOVO,
    NOVO
}
