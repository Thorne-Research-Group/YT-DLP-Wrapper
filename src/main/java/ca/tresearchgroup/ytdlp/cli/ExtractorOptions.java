package ca.tresearchgroup.ytdlp.cli;

import picocli.CommandLine;

public class ExtractorOptions {
    @CommandLine.Option(names = "--extractor-retries")
    private String extractorRetries;
    @CommandLine.Option(names = "--allow-dynamic-mpd")
    private String allowDynamicMpd;
    @CommandLine.Option(names = "--hls-split-discontinuity")
    private String hlsSplitDiscontinuity;
    @CommandLine.Option(names = "--extractor-args")
    private String extractorArgs;
}
