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

        Flight edinburgh = new Flight("EDI", 2, "2023-01-01", "07:00:00");
        flightService.addNewFlight(edinburgh);

        Flight tokyo = new Flight("HND", 250, "2024-04-15", "16:30:00");
        flightService.addNewFlight(tokyo);

        Flight calgary = new Flight("YYC", 200, "2024-08-24", "23:00:00");
        flightService.addNewFlight(calgary);

        Passenger colin = new Passenger("Colin", "colin@brightnetwork.co.uk");
        passengerService.addNewPassenger(colin);

        Passenger anna = new Passenger("Anna", "anna@brightnetwork.co.uk");
        passengerService.addNewPassenger(anna);

        Passenger zsolt = new Passenger("Zsolt", "zsolt@brightnetwork.co.uk");
        passengerService.addNewPassenger(zsolt);

        Passenger richard = new Passenger("Richard", "richard@brightnetwork.co.uk");
        passengerService.addNewPassenger(richard);

    }
}