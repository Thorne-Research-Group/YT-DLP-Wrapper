package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EntriesItem{

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("resolution")
	private String resolution;

	@JsonProperty("playlist_id")
	private String playlistId;

	@JsonProperty("format_id")
	private String formatId;

	@JsonProperty("id")
	private String id;

	@JsonProperty("playlist_uploader_id")
	private String playlistUploaderId;

	@JsonProperty("height")
	private int height;

	@JsonProperty("ext")
	private String ext;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("like_count")
	private int likeCount;

	@JsonProperty("n_entries")
	private int nEntries;

	@JsonProperty("format")
	private String format;

	@JsonProperty("webpage_url")
	private String webpageUrl;

	@JsonProperty("webpage_url_basename")
	private String webpageUrlBasename;

	@JsonProperty("playlist_uploader")
	private String playlistUploader;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("alt_title")
	private String altTitle;

	@JsonProperty("extractor_key")
	private String extractorKey;

	@JsonProperty("channel_id")
	private String channelId;

	@JsonProperty("requested_subtitles")
	private List<String> requestedSubtitles;

	@JsonProperty("uploader_id")
	private String uploaderId;

	@JsonProperty("formats")
	private List<FormatsItem> formats;

	@JsonProperty("display_id")
	private String displayId;

	@JsonProperty("playlist_title")
	private String playlistTitle;

	@JsonProperty("artist")
	private String artist;

	@JsonProperty("vbr")
	private double vbr;

	@JsonProperty("extractor")
	private String extractor;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("duration")
	private double duration;

	@JsonProperty("playlist")
	private String playlist;

	@JsonProperty("uploader")
	private String uploader;

	@JsonProperty("stretched_ratio")
	private String stretchedRatio;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("track")
	private String track;

	@JsonProperty("upload_date")
	private String uploadDate;

	@JsonProperty("requested_formats")
	private List<RequestedFormatsItem> requestedFormats;

	@JsonProperty("vcodec")
	private String vcodec;

	@JsonProperty("creator")
	private String creator;

	@JsonProperty("age_limit")
	private int ageLimit;

	@JsonProperty("fps")
	private int fps;

	@JsonProperty("uploader_url")
	private String uploaderUrl;

	@JsonProperty("average_rating")
	private double averageRating;

	@JsonProperty("channel_url")
	private String channelUrl;

	@JsonProperty("abr")
	private double abr;

	@JsonProperty("playlist_index")
	private int playlistIndex;

	@JsonProperty("acodec")
	private String acodec;

	@JsonProperty("width")
	private int width;

	@JsonProperty("is_live")
	private String isLive;

	@JsonProperty("thumbnails")
	private List<ThumbnailsItem> thumbnails;

	@JsonProperty("dislike_count")
	private int dislikeCount;

	@JsonProperty("view_count")
	private int viewCount;

	@JsonProperty("album")
	private String album;

	@JsonProperty("subtitles")
	private Subtitles subtitles;

	@JsonProperty("ie_key")
	private String ieKey;

	@JsonProperty("_type")
	private String type;

	@JsonProperty("url")
	private String url;
}