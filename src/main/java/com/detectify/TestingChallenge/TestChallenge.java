package com.detectify.TestingChallenge;



	
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.net.URI;
import java.net.URLEncoder;
import java.util.List;

public class TestChallenge {
	    
	    private static String END_POINT = "http://0.0.0.0:8080/";

	  /*  public void visaStatus() {

	        Client client = ClientBuilder.newClient();
	        List<String> response = client.target(END_POINT)
	                .request(MediaType.APPLICATION_JSON)
	                .accept(MediaType.APPLICATION_JSON)
	                .get(new GenericType<List<String>>(){});
	        
	        client.close();
	    }*/

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
	    
	    
	    public static void getConfig() {

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
	    

	 /*   public void skapaNyString(String String) {
	        Client client = ClientBuilder.newClient();

	        Response response = client.target(END_POINT)
	                .request(MediaType.APPLICATION_JSON)
	                .accept(MediaType.APPLICATION_JSON)
	                .post(Entity.json(String)); //går till objektet via JSON, sätter formatet till JSON
	        client.close();
	    }


	    public void updateraStringsDatum(String String, String id, String date) {
	        Client client = ClientBuilder.newClient();
	        //String.setDatum(date);
	        Response response = client.target(END_POINT + id)
	                .request(MediaType.APPLICATION_JSON)
	                .accept(MediaType.APPLICATION_JSON)
	                .put(Entity.json(String)) ;
	        client.close();
	    }

	    public void taBortString(String id) {

	        Client client = ClientBuilder.newClient();
	        String response = client.target(END_POINT + id)
	                .request(MediaType.APPLICATION_JSON)
	                .accept(MediaType.APPLICATION_JSON)
	                .delete(String.class);

	        client.close();
	    }
	*/

	}


