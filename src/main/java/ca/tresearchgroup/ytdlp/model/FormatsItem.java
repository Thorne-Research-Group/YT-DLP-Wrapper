package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FormatsItem{

	@JsonProperty("ext")
	private String ext;

	@JsonProperty("asr")
	private int asr;

	@JsonProperty("vcodec")
	private String vcodec;

	@JsonProperty("tbr")
	private double tbr;

	@JsonProperty("fps")
	private String fps;

	@JsonProperty("format")
	private String format;

	@JsonProperty("filesize")
	private int filesize;

	@JsonProperty("url")
	private String url;

	@JsonProperty("quality")
	private int quality;

	@JsonProperty("protocol")
	private String protocol;

	@JsonProperty("http_headers")
	private HttpHeaders httpHeaders;

	@JsonProperty("format_note")
	private String formatNote;

	@JsonProperty("acodec")
	private String acodec;

	@JsonProperty("width")
	private String width;

	@JsonProperty("format_id")
	private String formatId;

	@JsonProperty("height")
	private String height;

	@JsonProperty("container")
	private String container;

	@JsonProperty("vbr")
	private double vbr;

	@JsonProperty("downloader_options")
	private DownloaderOptions downloaderOptions;

	@JsonProperty("abr")
	private double abr;
}