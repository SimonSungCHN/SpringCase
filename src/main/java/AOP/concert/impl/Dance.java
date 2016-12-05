package AOP.concert.impl;

import org.springframework.stereotype.Component;

import AOP.concert.Performance;

@Component
public class Dance implements Performance {

	@Override
	public void perform() {
		System.out.println("ddd");

	}

}
