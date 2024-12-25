package com.in28minutes.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

	public int[] retrieveData() {
		return new int[] {111,121,112,5114,6117,8118};
	}
}
