package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight ethiopia = new Flight("ADD", 43, "2024-06-06", "07:00:00");
        flightService.addNewFlight(ethiopia);

        Flight uk = new Flight("LDN", 50, "2024-26-05", "16:30:00");
        flightService.addNewFlight(uk);

        Flight spain = new Flight("BCL", 63, "2024-13-06", "23:00:00");
        flightService.addNewFlight(spain);

        Passenger gellila = new Passenger("Gellila", "gellila@gmail.com");
        passengerService.addNewPassenger(gellila);

        Passenger gideon = new Passenger("Gideon", "gideon@gmail.com");
        passengerService.addNewPassenger(gideon);

        Passenger jonathan = new Passenger("Jonathan", "jonathan@gmail.com");
        passengerService.addNewPassenger(jonathan);

        Passenger sirkut = new Passenger("Sirkut", "sirkut@gmail.com");
        passengerService.addNewPassenger(sirkut);

    }
}