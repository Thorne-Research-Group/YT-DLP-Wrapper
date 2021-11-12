package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class VideoFormatOptions {
    @CommandLine.Option(names = "--format")
    private String format;
    @CommandLine.Option(names = "--format-sort")
    private String formatSort;
    @CommandLine.Option(names = "--format-sort-force")
    private String formatSortForce;
    @CommandLine.Option(names = "--video-multistreams")
    private String videoMultiStreams;
    @CommandLine.Option(names = "--audio-multistreams")
    private String audioMultiStreams;
    @CommandLine.Option(names = "--prefer-free-formats")
    private String preferFreeFormats;
    @CommandLine.Option(names = "--check-formats")
    private String checkFormats;
    @CommandLine.Option(names = "--list-formats")
    private String listFormats;
    @CommandLine.Option(names = "--merge-output-format")
    private String mergeOutputFormat;
}
