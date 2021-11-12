package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RequestedFormatsItem{

	@JsonProperty("container")
	private String container;

	@JsonProperty("ext")
	private String ext;

	@JsonProperty("asr")
	private String asr;

	@JsonProperty("vcodec")
	private String vcodec;

	@JsonProperty("tbr")
	private double tbr;

	@JsonProperty("fps")
	private int fps;

	@JsonProperty("format")
	private String format;

	@JsonProperty("filesize")
	private int filesize;

	@JsonProperty("url")
	private String url;

	@JsonProperty("quality")
	private int quality;

	@JsonProperty("abr")
	private double abr;

	@JsonProperty("protocol")
	private String protocol;

	@JsonProperty("http_headers")
	private HttpHeaders httpHeaders;

	@JsonProperty("format_note")
	private String formatNote;

	@JsonProperty("acodec")
	private String acodec;

	@JsonProperty("width")
	private int width;

	@JsonProperty("format_id")
	private String formatId;

	@JsonProperty("downloader_options")
	private DownloaderOptions downloaderOptions;

	@JsonProperty("height")
	private int height;

	@JsonProperty("vbr")
	private double vbr;
}