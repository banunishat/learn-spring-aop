package com.in28minutes.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

	public int[] retrieveData() {
		return new int[] {11,12,12,54,67,88};
	}
}