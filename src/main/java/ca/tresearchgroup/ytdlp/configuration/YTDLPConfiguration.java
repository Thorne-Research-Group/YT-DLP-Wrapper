package ca.tresearchgroup.ytdlp.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class YTDLPConfiguration {
    @JsonProperty("baseCommand")
    private String baseCommand;
}
