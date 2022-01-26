package br.plisbarbosa.quarkus.hello.world.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
	public String helloName(String name) {
		return "Hello " + name;
	}
}
