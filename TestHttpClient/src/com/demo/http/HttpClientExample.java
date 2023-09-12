package com.demo.http;
import java.net.http.*;
import java.net.URI; 
import java.util.Map; 
import java.util.List; 
import java.util.concurrent.CompletableFuture;

public class HttpClientExample 
{ 
	public static void main(String[] args) throws Exception 
	{ 
			String url="http://localhost:9091/products"; 
			sendGetAsyncRequest(url); 
	 } 
	
	public static void sendGetAsyncRequest(String url) throws Exception 
	{ 
			HttpClient client=HttpClient.newHttpClient(); 
			HttpRequest req=HttpRequest.newBuilder(new URI(url)).GET().build(); 
			System.out.println("Sending Asynchronous Request..."); 
			CompletableFuture<HttpResponse<String>> cf = client.sendAsync(req,HttpResponse.BodyHandlers.ofString()); 
			int count=0;
			System.out.println(cf.get());
			 System.out.println(cf.get().body());
			
			        
			
			     }
			
			     
			/*while(!cf.isDone()) 
			{ 
				System.out.println("Processing not done and doing other activity:"+ ++count); 
			} */
			//processResponse(cf.get()); 
	
	/*public static void processResponse(HttpResponse resp) 
	{ 
		System.out.println("Status Code:"+resp.statusCode()); 
 //System.out.println("Response Body:"+resp.body()); 
		HttpHeaders header=resp.headers(); 
		Map<String,List<String>> map=header.map(); 
		System.out.println("Response Headers"); 
		map.forEach((k,v)->System.out.println("\t"+k+":"+v)); 
	} */
 }