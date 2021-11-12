package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GeneralOptions {
    @CommandLine.Option(names = "--ignore-errors")
    private boolean ignoreErrors;
    @CommandLine.Option(names = "--abort-on-error")
    private boolean abortOnError;
    @CommandLine.Option(names = "--dump-user-agent")
    private boolean dumpUserAgent;
    @CommandLine.Option(names = "--list-extractors")
    private boolean listExtractors;
    @CommandLine.Option(names = "--extractor-descriptions")
    private boolean extractorDescriptions;
    @CommandLine.Option(names = "--force-generic-extractor")
    private boolean forceGenericExtractor;
    @CommandLine.Option(names = "--default-search")
    private String defaultSearch;
    @CommandLine.Option(names = "--ignore-config")
    private boolean ignoreConfig;
    @CommandLine.Option(names = "--config-location")
    private String configLocation;
    @CommandLine.Option(names = "--flat-playlist")
    private boolean flatPlaylist;
    @CommandLine.Option(names = "--mark-watched")
    private boolean markWatched;
    @CommandLine.Option(names = "--no-colors")
    private boolean noColors;
    @CommandLine.Option(names = "--compat-options")
    private String compatOptions;
}
