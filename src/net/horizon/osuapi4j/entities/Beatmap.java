package net.horizon.osuapi4j.entities;

import java.util.Date;

import org.json.JSONObject;

import net.horizon.osuapi4j.entities.enums.Mode;
import net.horizon.osuapi4j.utils.DateUtils;

public class Beatmap {

	private int beatMapSetID;
	private int beatMapID;
	private boolean approved;
	private int totalLength;
	private int hitLength;
	private String difficultyName;
	private String fileMD5;
	private float CS;
	private float OD;
	private float AR;
	private float HP;
	private Mode mode;
	private Date approveDate;
	private Date lastUpdate;
	private String artist;
	private String title;
	private String creator;
	private int bpm;
	private String source;
	private String tags;
	private int genreID;
	private int languageID;
	private int favouriteCount;
	private int playCount;
	private int passCount;
	private int maxCombo;
	private long starDifficulty;

	public Beatmap(JSONObject object) {
		this.beatMapSetID = object.getInt("beatmapset_id");
		this.beatMapID = object.getInt("beatmap_id");
		this.approved = object.getInt("approved") == 1 ? true : false;
		this.totalLength = object.getInt("total_length");
		this.hitLength = object.getInt("hit_length");
		this.difficultyName = object.getString("version");
		this.fileMD5 = object.getString("file_md5");
		this.CS = object.getLong("diff_size");
		this.OD = object.getLong("diff_overall");
		this.AR = object.getLong("diff_approach");
		this.HP = object.getLong("diff_drain");
		int mode = object.getInt("mode");
		switch (mode) {
		case 0:
			this.mode = Mode.STD;
			break;
		case 1:
			this.mode = Mode.TAIKO;
			break;
		case 2:
			this.mode = Mode.CTB;
			break;
		case 3:
			this.mode = Mode.MAINA;
			break;
		}
		this.approveDate = DateUtils.parseDateFromString(object.getString("approved_date"));
		this.lastUpdate = DateUtils.parseDateFromString(object.getString("last_update"));
		this.artist = object.getString("artist");
		this.title = object.getString("title");
		this.creator = object.getString("creator");
		this.bpm = object.getInt("bpm");
		this.source = object.getString("source");
		this.tags = object.getString("tags");
		this.genreID = object.getInt("genre_id");
		this.languageID = object.getInt("language_id");
		this.favouriteCount = object.getInt("favourite_count");
		this.playCount = object.getInt("playcount");
		this.passCount = object.getInt("passcount");
		this.maxCombo = object.getInt("max_combo");
		this.starDifficulty = object.getLong("difficultyrating");
	}

	public boolean isApproved() {
		return approved;
	}
	
	public Date getApproveDate() {
		return approveDate;
	}

	public float getAR() {
		return AR;
	}

	public String getArtist() {
		return artist;
	}

	public int getBeatMapID() {
		return beatMapID;
	}

	public int getBeatMapSetID() {
		return beatMapSetID;
	}

	public int getBPM() {
		return bpm;
	}

	public String getCreator() {
		return creator;
	}

	public float getCS() {
		return CS;
	}

	public String getDifficultyName() {
		return difficultyName;
	}

	public int getFavouriteCount() {
		return favouriteCount;
	}

	public String getFileMD5() {
		return fileMD5;
	}

	public int getGenreID() {
		return genreID;
	}

	public int getHitLength() {
		return hitLength;
	}

	public float getHP() {
		return HP;
	}

	public int getLanguageID() {
		return languageID;
	}

	public int getMaxCombo() {
		return maxCombo;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public Mode getMode() {
		return mode;
	}

	public float getOD() {
		return OD;
	}

	public int getPassCount() {
		return passCount;
	}

	public int getPlayCount() {
		return playCount;
	}

	public String getSource() {
		return source;
	}

	public long getStarDifficulty() {
		return starDifficulty;
	}

	public String getTags() {
		return tags;
	}

	public String getTitle() {
		return title;
	}

	public int getTotalLength() {
		return totalLength;
	}
}
