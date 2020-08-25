package com.triveratravel.model;

// import org.springframework.data.annotation.Id; difference vs javax.persistence.Id?

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;

// JPA = POJO that has been annotated to defined the mapping between the entity and the
// relational database
@Entity // Needed to make it a valid JPA entity
public class Reservation {
    private Long id;
    private String nameOnReservation;
    private LocalDate arrivalDate;
    // annotations inform JPA that this field holds the primary key and the value must
    // be generated when the instance is first added to the database
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int numberOfNights;

    public Reservation(){
        // default no argument constructor required by JPA
    }
    public Reservation(String nameOnReservation, LocalDate arrivalDate, int numberOfNights){
        this.nameOnReservation = nameOnReservation;
        this.arrivalDate = arrivalDate;
        this.numberOfNights = numberOfNights;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOnReservation() {
        return nameOnReservation;
    }

    public void setNameOnReservation(String nameOnReservation) {
        this.nameOnReservation = nameOnReservation;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}
