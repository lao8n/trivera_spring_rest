package com.triveratravel;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.triveratravel.config.JavaConfig;
import com.triveratravel.service.HotelService;

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
public class Application {

	public static void main(String[] args) {
		Application client = new Application();
		client.test();
	}

	public void test() {
		try (final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JavaConfig.class)) {
			HotelService hotelService = applicationContext.getBean(HotelService.class);

			hotelService.makeReservation("Crash", LocalDate.now(), 5);

			System.out.println(hotelService);
			hotelService.getReservations().forEach(System.out::println);
		}
	}

}
