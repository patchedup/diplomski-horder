package com.example.horder.controllers;


import com.example.horder.dtos.GuitarDTO;
import com.example.horder.models.Guitar;
import com.example.horder.models.TopImage;
import com.example.horder.services.GuitarService;
import com.example.horder.services.TopImageService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("horder/guitars/")
public class GuitarController {

    @Autowired
    GuitarService guitarService;

    /* get all guitars */
    @GetMapping(value = "/all")
    public ResponseEntity<List<GuitarDTO>> getAllGuitars() {

            List<GuitarDTO> guitarsDTO = new ArrayList<>();
            List<Guitar> guitars = guitarService.findAll();
            for (Guitar g : guitars) {
                    GuitarDTO guitarDTO = new GuitarDTO();

                    guitarDTO.setId(g.getId());
                    guitarDTO.setManufacturerOfGuitar(g.getManufacturerOfGuitar());
                    guitarDTO.setModelOfGuitar(g.getModelOfGuitar());
                    guitarDTO.setYearOfProduction(g.getYearOfProduction());
                    guitarDTO.setPrice(g.getPrice());
                    guitarDTO.setStateOfGuitar(g.getStateOfGuitar());
                    guitarDTO.setTypeOfGuitar(g.getTypeOfGuitar());
                    guitarDTO.setTypeOfMagnets(g.getTypeOfMagnets());
                    guitarDTO.setTuners(g.getTuners());
                    guitarDTO.setTypeOfWood(g.getTypeOfWood());
                    guitarDTO.setDescription(g.getDescription());

                    guitarsDTO.add(guitarDTO);
        }
        return new ResponseEntity<>(guitarsDTO, HttpStatus.OK);
    }

}
