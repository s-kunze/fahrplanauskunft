/*******************************************************************************
 * Data.java, created on 18.11.2019
 *
 * This file is part of com.example.fahrplanauskunft.
 *
 * Copyright (c) 2019 TAF mobile GmbH,
 * Leutragraben 1, 07743 Jena, Germany. All Rights Reserved
 *******************************************************************************/
package com.example.fahrplanauskunft;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author skunze
 */
@Data
public class Fahrplan {

	private Map<String, List<Stop>> lines;

}
