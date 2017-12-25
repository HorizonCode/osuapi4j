package net.horizon.osuapi4j.exceptions;

public class NoSuchBeatmap extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchBeatmap(String message) {
		super(message);
	}
}