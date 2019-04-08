package edu.hm.cs.fwp.cloudtrain.core.boundary;

import java.util.Locale;
import java.util.UUID;

import edu.hm.cs.fwp.cloudtrain.core.entity.Message;
import org.springframework.stereotype.Service;

@Service
public class HelloWorld {

	public Message getHelloMessage() {
		Message result = new Message(UUID.randomUUID());
		result.setCode("hello");
		result.setText("Welcome to Cloud Native Java with Spring Boot!");
		result.setLocale(Locale.GERMAN);
		return result;
	}
}
