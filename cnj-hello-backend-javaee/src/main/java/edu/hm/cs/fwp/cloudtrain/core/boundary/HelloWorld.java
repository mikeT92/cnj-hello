package edu.hm.cs.fwp.cloudtrain.core.boundary;

import edu.hm.cs.fwp.cloudtrain.core.entity.Message;

import javax.ejb.Stateless;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Stateless
public class HelloWorld {

    public Message getHelloMessage() {
        return new Message(UUID.randomUUID(), "hello", "Welcome to Cloud Native Java with Java EE!");
    }
}
