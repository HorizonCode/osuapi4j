package net.horizon.osuapi4j;

import org.json.JSONArray;
import org.json.JSONObject;

import net.horizon.osuapi4j.entities.Beatmap;
import net.horizon.osuapi4j.entities.BeatmapSet;
import net.horizon.osuapi4j.entities.User;
import net.horizon.osuapi4j.utils.WebUtils;
import net.horizon.osuapi4j.exceptions.NoSuchBeatmap;
import net.horizon.osuapi4j.exceptions.NoSuchBeatmapSet;

public class osuAPI {

	private String apiKey;

	/**
	 * @param apiKey
	 *            Enter here your APIKey you got from https://osu.ppy.sh/p/api
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

	/**
	 * @param id
	 * @return returns a Beatmap and its Metadata
	 */
	public Beatmap getBeatmapByID(int id) throws NoSuchBeatmap {
		JSONArray array = WebUtils.getJSONArray("https://osu.ppy.sh/api/get_beatmaps?k=" + apiKey + "&b=" + id);
		if (array.length() >= 1) {
			JSONObject object = new JSONObject(array.get(0));
			return new Beatmap(object);
		}
		throw new NoSuchBeatmap("No beatmap found by the id " + id);
	}

	/**
	 * @param id
	 * @return returns a BeatmapSet and its BeatMaps with Metadata
	 */
	public BeatmapSet getBeatmapSetByID(int id) throws NoSuchBeatmapSet {
		JSONArray array = WebUtils.getJSONArray("https://osu.ppy.sh/api/get_beatmaps?k=" + apiKey + "&s=" + id);
		if (array.length() >= 1) {
			return new BeatmapSet(array);
		}
		throw new NoSuchBeatmapSet("No beatmapSet found by the id " + id);
	}
}
