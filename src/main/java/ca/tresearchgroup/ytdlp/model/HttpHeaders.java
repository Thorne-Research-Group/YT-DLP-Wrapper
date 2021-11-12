package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HttpHeaders{

	@JsonProperty("Accept-Charset")
	private String acceptCharset;

	@JsonProperty("Accept")
	private String accept;

	@JsonProperty("User-Agent")
	private String userAgent;

	@JsonProperty("Accept-Language")
	private String acceptLanguage;

	@JsonProperty("Accept-Encoding")
	private String acceptEncoding;
}