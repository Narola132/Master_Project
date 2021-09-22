package com.counselling.covid.repository;

import com.counselling.covid.entity.AppointmentBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/appointmentbookings")
public interface AppointmentBookingRepository extends JpaRepository<AppointmentBooking, Integer> {



}