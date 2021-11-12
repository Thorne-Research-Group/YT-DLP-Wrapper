package ca.tresearchgroup.ytdlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DownloaderOptions{

	@JsonProperty("http_chunk_size")
	private int httpChunkSize;
}