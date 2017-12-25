package net.horizon.osuapi4j;

import org.json.JSONObject;

import net.horizon.osuapi4j.entities.User;
import net.horizon.osuapi4j.utils.WebUtils;

public class osuAPI {

	private String apiKey;

	/**
	 * @param apiKey Enter here your APIKey you got from https://osu.ppy.sh/p/api
	 */
	public osuAPI(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @param username
	 * @return returns a User
	 */
	public User getUserByName(String username) {
		JSONObject object = WebUtils.getJSONObject("https://osu.ppy.sh/api/get_user?k=" + apiKey + "&u=" + username);
		return new User(object);
	}

	/**
	 * @param username
	 * @return returns a User
	 */
	public User getUserByID(int id) {
		JSONObject object = WebUtils.getJSONObject("https://osu.ppy.sh/api/get_user?k=" + apiKey + "&u=" + id);
		return new User(object);
	}
}
