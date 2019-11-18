/*******************************************************************************
 * Database.java, created on 18.11.2019
 *
 * This file is part of com.example.fahrplanauskunft.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.fahrplanauskunft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

/**
 * @author skunze
 */
public class Database {

	public static Fahrplan getFahrplan() {
		Fahrplan result = new Fahrplan();

		// @formatter:off
		Stop stop1 = new Stop("Ernst-Abbe-Platz", List.of(
				DateTime.parse("2019-11-18T08:00:00Z"),
				DateTime.parse("2019-11-18T08:05:00Z"),
				DateTime.parse("2019-11-18T08:10:00Z")));
		Stop stop2 = new Stop("Löbdergraben", List.of(
				DateTime.parse("2019-11-18T08:01:00Z"),
				DateTime.parse("2019-11-18T08:06:00Z"), 
				DateTime.parse("2019-11-18T08:11:00Z")));
		Stop stop3 = new Stop("Paradiesbahnhof", List.of(
				DateTime.parse("2019-11-18T08:03:00Z"),
				DateTime.parse("2019-11-18T08:08:00Z"), 
				DateTime.parse("2019-11-18T08:13:00Z")));
		// @formatter:on

		List<Stop> stops = List.of(stop1, stop2, stop3);

		Map<String, List<Stop>> lines = new HashMap<>();
		lines.put("Linie 5", stops);

		result.setLines(lines);

		return result;
	}

}
