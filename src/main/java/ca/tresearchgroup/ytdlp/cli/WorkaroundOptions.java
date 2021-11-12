package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class WorkaroundOptions {
    @CommandLine.Option(names = "--encoding")
    private String encoding;
    @CommandLine.Option(names = "--no-check-certificate")
    private boolean noCheckCertificate;
    @CommandLine.Option(names = "--prefer-insecure")
    private boolean preferInsecure;
    @CommandLine.Option(names = "--user-agent")
    private String userAgent;
    @CommandLine.Option(names = "--referer")
    private String referer;
    @CommandLine.Option(names = "--add-header")
    private String addHeader;
    @CommandLine.Option(names = "--bidi-workaround")
    private boolean bidiWorkaround;
    @CommandLine.Option(names = "--sleep-requests")
    private String sleepRequests;
    @CommandLine.Option(names = "--sleep-interval")
    private String sleepInterval;
    @CommandLine.Option(names = "--max-sleep-interval")
    private String maxSleepInterval;
    @CommandLine.Option(names = "--sleep-subtitles")
    private String sleepSubtitles;
}
