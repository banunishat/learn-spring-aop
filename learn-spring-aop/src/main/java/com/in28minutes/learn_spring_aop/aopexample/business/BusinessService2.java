package com.in28minutes.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime;
import com.in28minutes.learn_spring_aop.aopexample.data.DataService2;

@Service
public class BusinessService2 {

	DataService2 dataService2;
	public BusinessService2(DataService2 dataService2)
	{
		this.dataService2 = dataService2;
	}
	
	@TrackTime
	public int calculateMin() {
		int[] data = dataService2.retrieveData();
		return Arrays.stream(data).min().orElse(0);
	}

	
}
