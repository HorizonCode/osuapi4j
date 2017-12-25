package net.horizon.osuapi4j.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class WebUtils {
	
	private static String getJSONText(String url) throws Exception {
		URL website = new URL(url);
		URLConnection connection = website.openConnection();
		connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		StringBuilder response = new StringBuilder();
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			response.append("\n");
		}
		in.close();

		return response.toString();
	}
	
	public static JSONObject getJSONObject(String url) {
		try {
			String jsonstring = getJSONText(url);
			String formatted = jsonstring.substring(1, jsonstring.length() - 1);
			JSONObject json = new JSONObject(formatted);
			return json;
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
	
	public static JSONArray getJSONArray(String url) {
		try {
			String jsonstring = getJSONText(url);
			JSONArray json = new JSONArray(jsonstring);
			return json;
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
	
	

}
