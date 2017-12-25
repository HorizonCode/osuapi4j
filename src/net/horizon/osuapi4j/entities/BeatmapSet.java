package net.horizon.osuapi4j.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class BeatmapSet {

	private int beatMapSetID = -1;
	private String beatMapSetTitle;
	private String beatMapSetAritst;
	private String beatMapSetCreator;
	private List<Beatmap> beatmaps = new ArrayList<Beatmap>();

	public BeatmapSet(JSONArray array) {
		Iterator<Object> i = array.iterator();
		while (i.hasNext()) {
			JSONObject object = new JSONObject(i.next());
			if (this.beatMapSetAritst == null || this.beatMapSetAritst.isEmpty()) {
				this.beatMapSetAritst = object.getString("artist");
			}
			if (this.beatMapSetCreator == null || this.beatMapSetCreator.isEmpty()) {
				this.beatMapSetCreator = object.getString("creator");
			}
			if (this.beatMapSetTitle == null || this.beatMapSetTitle.isEmpty()) {
				this.beatMapSetTitle = object.getString("title");
			}
			if (this.beatMapSetID == -1) {
				this.beatMapSetTitle = object.getString("beatmapset_id");
			}
			addBeatmap(object);
		}
	}

	private void addBeatmap(JSONObject object) {
		beatmaps.add(new Beatmap(object));
	}

	public List<Beatmap> getBeatmaps() {
		return beatmaps;
	}

	public int getBeatMapSetID() {
		return beatMapSetID;
	}

	public String getBeatMapSetAritst() {
		return beatMapSetAritst;
	}

	public String getBeatMapSetCreator() {
		return beatMapSetCreator;
	}

	public String getBeatMapSetTitle() {
		return beatMapSetTitle;
	}

}
