package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class YTDLP {

	@JsonProperty("_type")
	private String type;

	@JsonProperty("requested_subtitles")
	private String requestedSubtitles;

	@JsonProperty("uploader_id")
	private String uploaderId;

	@JsonProperty("formats")
	private List<FormatsItem> formats;

	@JsonProperty("display_id")
	private String displayId;

	@JsonProperty("fulltitle")
	private String fulltitle;

	@JsonProperty("vbr")
	private double vbr;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("description")
	private String description;

	@JsonProperty("extractor")
	private String extractor;

	@JsonProperty("title")
	private String title;

	@JsonProperty("resolution")
	private String resolution;

	@JsonProperty("duration")
	private int duration;

	@JsonProperty("playlist")
	private String playlist;

	@JsonProperty("uploader")
	private String uploader;

	@JsonProperty("format_id")
	private String formatId;

	@JsonProperty("stretched_ratio")
	private String stretchedRatio;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("id")
	private String id;

	@JsonProperty("upload_date")
	private String uploadDate;

	@JsonProperty("height")
	private int height;

	@JsonProperty("requested_formats")
	private List<RequestedFormatsItem> requestedFormats;

	@JsonProperty("ext")
	private String ext;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("vcodec")
	private String vcodec;

	@JsonProperty("like_count")
	private int likeCount;

	@JsonProperty("age_limit")
	private int ageLimit;

	@JsonProperty("fps")
	private int fps;

	@JsonProperty("format")
	private String format;

	@JsonProperty("webpage_url")
	private String webpageUrl;

	@JsonProperty("uploader_url")
	private String uploaderUrl;

	@JsonProperty("average_rating")
	private double averageRating;

	@JsonProperty("webpage_url_basename")
	private String webpageUrlBasename;

	@JsonProperty("channel_url")
	private String channelUrl;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("playlist_index")
	private String playlistIndex;

	@JsonProperty("abr")
	private double abr;

	@JsonProperty("automatic_captions")
	private AutomaticCaptions automaticCaptions;

	@JsonProperty("acodec")
	private String acodec;

	@JsonProperty("is_live")
	private String isLive;

	@JsonProperty("width")
	private int width;

	@JsonProperty("extractor_key")
	private String extractorKey;

	@JsonProperty("thumbnails")
	private List<ThumbnailsItem> thumbnails;

	@JsonProperty("channel_id")
	private String channelId;

	@JsonProperty("view_count")
	private int viewCount;

	@JsonProperty("dislike_count")
	private int dislikeCount;

	@JsonProperty("_filename")
	private String filename;

	@JsonProperty("entries")
	private List<EntriesItem> entries;

	@JsonProperty("subtitles")
	private Subtitles subtitles;
}