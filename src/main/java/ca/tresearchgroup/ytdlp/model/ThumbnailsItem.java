package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ThumbnailsItem{

	@JsonProperty("width")
	private int width;

	@JsonProperty("id")
	private String id;

	@JsonProperty("resolution")
	private String resolution;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private int height;
}