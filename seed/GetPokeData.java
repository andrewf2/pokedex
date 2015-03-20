package seed;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;




import json.QCJSON.JSONInputStream;
import json.QCJSON.JSONUtilities;


public class GetPokeData implements Runnable{
	private HashMap aMap = new HashMap();
	
	//public RestClient(HashSet<String> dex){
	public void run() {
		try{
		//String url = "http://sra-api.herokuapp.com/areas/1";
		//Create a string holding url
		String url = "http://pokeapi.co/api/v1/pokedex";
		//pass the url into URL object
		URL obj = new URL(url);
		//Establish Connection to URL
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		//Specify which REST method you are using e.i. POST, GET, PUT, DELETE
		con.setRequestMethod("GET");
		//Get response back from server, usually in the form of 200=success,404=bad connection
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		//buffered reader gets the inputstream from the server
		JSONInputStream inFromClient = new JSONInputStream(con.getInputStream());
		aMap = (HashMap)inFromClient.readObject();
		
		
		setMap(aMap);
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void setMap(HashMap map){
		this.aMap = map;
	}
	public HashMap getMap(){
		return aMap;
	}
	
}