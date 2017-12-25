package net.horizon.osuapi4j.entities;


import org.json.JSONObject;

public class User {

	private String userID;
	private String username;
	private String totalHits300;
	private String totalHits100;
	private String totalHits50;
	private String playcount;
	private String rankedScore;
	private String totalScore;
	private String rank;
	private String level;
	private String pp;
	private String accuracy;
	private String RanksSS;
	private String RanksS;
	private String RanksA;
	private String country;
	private String countryRank;

	public User(JSONObject json) {
		userID = json.getString("user_id");
		username = json.getString("username");
		totalHits300 = json.getString("count300");
		totalHits100 = json.getString("count100");
		totalHits50 = json.getString("count50");
		playcount = json.getString("playcount");
		rankedScore = json.getString("ranked_score");
		totalScore = json.getString("total_score");
		rank = json.getString("pp_rank");
		level = json.getString("level");
		pp = json.getString("pp");
		accuracy = json.getString("accuracy");
		RanksSS = json.getString("count_rank_ss");
		RanksS = json.getString("count_rank_s");
		RanksA = json.getString("count_rank_a");
		country = json.getString("country");
		countryRank = json.getString("pp_country_rank");
	}

	public String getAccuracy() {
		return accuracy;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryRank() {
		return countryRank;
	}

	public String getLevel() {
		return level;
	}

	public String getPlaycount() {
		return playcount;
	}

	public String getPP() {
		return pp;
	}

	public String getRank() {
		return rank;
	}

	public String getRankedScore() {
		return rankedScore;
	}

	public String getRanksA() {
		return RanksA;
	}

	public String getRanksS() {
		return RanksS;
	}

	public String getRanksSS() {
		return RanksSS;
	}

	public String getTotalHits100() {
		return totalHits100;
	}

	public String getTotalHits300() {
		return totalHits300;
	}

	public String getTotalHits50() {
		return totalHits50;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public String getUserID() {
		return userID;
	}

	public String getUsername() {
		return username;
	}

}
