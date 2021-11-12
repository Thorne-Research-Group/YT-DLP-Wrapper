package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DownloadOptions {
    @CommandLine.Option(names = "--concurrent-fragments")
    private String concurrentFragments;
    @CommandLine.Option(names = "--limit-rate")
    private String limitRate;
    @CommandLine.Option(names = "--throttled-rate")
    private String throttledRate;
    @CommandLine.Option(names = "--retries")
    private String retries;
    @CommandLine.Option(names = "--fragment-retries")
    private String fragmentRetries;
    @CommandLine.Option(names = "--skip-unavailable-fragments")
    private boolean skipUnavailableFragments;
    @CommandLine.Option(names = "--abort-on-unavailable-fragment")
    private boolean abortOnUnavailableFragment;
    @CommandLine.Option(names = "--keep-fragments")
    private boolean keepFragments;
    @CommandLine.Option(names = "--buffer-size")
    private String bufferSize;
    @CommandLine.Option(names = "--resize-buffer")
    private boolean resizeBuffer;
    @CommandLine.Option(names = "--http-chunk-size")
    private String httpChunckSize;
    @CommandLine.Option(names = "--playlist-reverse")
    private boolean playlistReverse;
    @CommandLine.Option(names = "--playlist-random")
    private boolean playlistRandom;
    @CommandLine.Option(names = "--xattr-set-filesize")
    private boolean xattrSetFilesize;
    @CommandLine.Option(names = "--hls-use-mpegts")
    private boolean hlsUseMpegts;
    @CommandLine.Option(names = "--downloader")
    private String downloader;
    @CommandLine.Option(names = "--downloader-args")
    private String downloaderArgs;
}
