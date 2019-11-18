/*******************************************************************************
 * Stop.java, created on 18.11.2019
 *
 * This file is part of com.example.fahrplanauskunft.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.fahrplanauskunft;

import java.util.List;

import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author skunze
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stop {

	private String name;
	private List<DateTime> departures;

}
