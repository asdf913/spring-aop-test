package org.springframework.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(final String[] args) {
		try (final ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
		}
	}

}