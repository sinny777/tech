/*******************************************************************************
 *
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER. 
 *  Copyright (c) 2015 Jade Global
 *  All Rights Reserved. All content is proprietary and confidential.
 *
 *******************************************************************************/

package com.jadecore.finance.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.jadecore.finance.abstraction.repository.CommonRepository;

/*
 * @author gurvinder.singh
 * @Date 09-Sep-2015
 */

@Repository
public class CommonRepositoryImpl implements CommonRepository {

	private static final Logger logger = LoggerFactory
			.getLogger(CommonRepositoryImpl.class);

	@Override
	public String helloWorld() {
		return "Hello World from Repository";
	}

}
