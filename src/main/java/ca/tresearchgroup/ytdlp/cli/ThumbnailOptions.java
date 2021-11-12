package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ThumbnailOptions {
    @CommandLine.Option(names = "--write-thumbnail")
    private boolean writeThumbnails;
    @CommandLine.Option(names = "--write-all-thumbnails")
    private boolean writeAllThumbnails;
    @CommandLine.Option(names = "--list-thumbnails")
    private boolean listThumbnails;
}
