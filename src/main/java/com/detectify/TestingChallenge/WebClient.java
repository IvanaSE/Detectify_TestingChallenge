package com.detectify.TestingChallenge;




import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.omg.CORBA.TRANSACTION_UNAVAILABLE;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.net.URI;
import java.net.URLEncoder;
import java.util.List;

public class WebClient {

	private static String END_POINT = "http://0.0.0.0:8080/";

	

	public static void getStatus() {

		Client client = ClientBuilder.newClient();
		try {

			String response = client.target(END_POINT + "status")     
					.request(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.get(String.class);

			System.out.println(response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		client.close();
	}

	public static void saveSettingsStr(SettingStr setting) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		//Object to JSON in String
		String jsonString = mapper.writeValueAsString(setting);

		ClientConfig config = new ClientConfig();
		config.register(JacksonJsonProvider.class);
		Client client = ClientBuilder.newClient(config);

		Response response = client.target(END_POINT + "settings/" + setting.getTarget_id())
				.request(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.post(Entity.json(setting)); // går till objektet via JSON, sätter formatet till JSON
		// .post(Entity.json(jsonString));
		System.out.println(response);
		System.out.println(jsonString);
		client.close();
	}

	



	public static void saveSettings(Setting setting) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		//Object to JSON in String
		String jsonString = mapper.writeValueAsString(setting);

		ClientConfig config = new ClientConfig();
		config.register(JacksonJsonProvider.class);
		Client client = ClientBuilder.newClient(config);

		Response response = client.target(END_POINT + "settings/" + setting.getTarget_id())
				.request(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.post(Entity.json(setting)); // går till objektet via JSON, sätter formatet till JSON
		// .post(Entity.json(jsonString));
		System.out.println(response);
		System.out.println(jsonString);
		client.close();
	}

	
	public static void loadSettings(int targetId) {

		Client client = ClientBuilder.newClient();
		try {

			String response = client.target(END_POINT + "settings/" + targetId)     
					.request(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.get(String.class);

			System.out.println(response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		client.close();
	}
	
	
	

	public static void testSettings(int targetId) {

		Client client = ClientBuilder.newClient();
		try {

			String response = client.target(END_POINT + "testhook/" + targetId)     
					.request(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.get(String.class);

			System.out.println(response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		client.close();
	}


	

	public static void deleteSettings(int targetId) {

		Client client = ClientBuilder.newClient();
		String response = client.target(END_POINT + "settings/" + targetId)
				.request(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.delete(String.class);
		System.out.println(response);

		client.close();
	}	    



}


