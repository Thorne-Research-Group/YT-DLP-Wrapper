package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {

	@JsonProperty("ext")
	private String ext;

	@JsonProperty("url")
	private String url;
}