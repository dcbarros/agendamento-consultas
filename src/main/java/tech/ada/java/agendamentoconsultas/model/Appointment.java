package tech.ada.java.agendamentoconsultas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;
import tech.ada.java.agendamentoconsultas.model.enums.AppointmentStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SQLRestriction("appointment_status = 'WAITING'")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate appointmentDate;
    @Column(updatable = false)
    private UUID uuid = UUID.randomUUID();
    private LocalTime appointmentStartTime;
    private LocalTime appointmentEndTime;
    private String appointmentDescription;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus = AppointmentStatus.WAITING;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}