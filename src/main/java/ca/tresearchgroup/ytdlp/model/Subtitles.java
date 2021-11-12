package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Subtitles{

	@JsonProperty("pt")
	private List<Language> pt;

	@JsonProperty("en")
	private List<Language> en;

	@JsonProperty("es")
	private List<Language> es;

	@JsonProperty("en-US")
	private List<Language> enUS;
}