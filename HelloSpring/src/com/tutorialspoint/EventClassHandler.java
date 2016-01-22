package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

public class EventClassHandler implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}