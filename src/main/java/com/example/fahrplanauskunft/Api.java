/*******************************************************************************
 * Api.java, created on 18.11.2019
 *
 * This file is part of com.example.fahrplanauskunft.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.fahrplanauskunft;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skunze
 */
@RestController
public class Api {

	@GetMapping("/")
	public List<Connection> getConnection(@RequestParam("start") String start, @RequestParam("stop") String stop,
			@RequestParam("departureTime") String departureTime) {
		Connection connection1 =
				new Connection("Ernst-Abbe-Platz", "Paradiesbahnhof", "Linie 5", "18.11.2019 08:00 Uhr");
		Connection connection2 =
				new Connection("Ernst-Abbe-Platz", "Paradiesbahnhof", "Linie 5", "18.11.2019 08:05 Uhr");

		return List.of(connection1, connection2);
	}

}
