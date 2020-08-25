package com.triveratravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveratravel.model.Flight;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC., Worldwide
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, Inc.
 *
 * Copyright (c) 2020 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 * 
 * @author The Trivera Tech Team.
 */
public interface FlightDepartureRepository extends JpaRepository<Flight, String> {

	List<Flight> findFlightsByDestinationCode(String destinationCode);
}
