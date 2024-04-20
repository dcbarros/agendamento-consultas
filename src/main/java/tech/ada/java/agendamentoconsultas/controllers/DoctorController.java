package tech.ada.java.agendamentoconsultas.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.java.agendamentoconsultas.model.Doctor;
import tech.ada.java.agendamentoconsultas.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor

public class DoctorController {

    private final DoctorService service;

    @GetMapping

    public List<Doctor> findAll(){

        return this.service.findALl();
    }

}
