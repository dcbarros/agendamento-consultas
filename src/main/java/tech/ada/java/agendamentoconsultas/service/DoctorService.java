package tech.ada.java.agendamentoconsultas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tech.ada.java.agendamentoconsultas.model.Doctor;
import tech.ada.java.agendamentoconsultas.respository.DoctorRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class DoctorService {
    private final DoctorRepository repository;
    public List<Doctor> findALl() {

        return this.repository.findAll();
    };

    public Doctor findByUuid(UUID uuid){
      return this.repository.findByUuid(uuid).orElseThrow(RuntimeException::new);
    };

    public Doctor addDoctor(Doctor doctor){
      return repository.save(doctor);
    };



}
