package ca.tresearchgroup.ytdlp.controller;

import ca.tresearchgroup.ytdlp.configuration.YTDLPConfiguration;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.*;

import java.io.File;
import java.io.FileNotFoundException;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ConfigurationService {
    public static YTDLPConfiguration YTDLPConfiguration;

    static {
        try {
            YTDLPConfiguration = (YTDLPConfiguration) Sys.getObjectFromJson(Sys.loadFile(new File("Configuration.json")), YTDLPConfiguration.class);
        } catch (JsonProcessingException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
