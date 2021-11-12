package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SimulationOptions {
    @CommandLine.Option(names = "--quiet")
    private boolean quietMode;
    @CommandLine.Option(names = "--no-warnings")
    private boolean noWarnings;
    @CommandLine.Option(names = "--simulate")
    private boolean simulate;
    @CommandLine.Option(names = "--ignore-no-formats-error")
    private boolean ignoreNoFormatsError;
    @CommandLine.Option(names = "--skip-download")
    private boolean skipDownload;
    @CommandLine.Option(names = "--print")
    private boolean print;
    @CommandLine.Option(names = "--dump-json")
    private boolean dumpJson;
    @CommandLine.Option(names = "--dump-single-json")
    private boolean dumpSingleJson;
    @CommandLine.Option(names = "--force-write-archive")
    private boolean forceWriteArchive;
    @CommandLine.Option(names = "--newline")
    private boolean newLine;
    @CommandLine.Option(names = "--progress")
    private boolean progress;
    @CommandLine.Option(names = "--console-title")
    private boolean consoleTitle;
    @CommandLine.Option(names = "--progress-template")
    private boolean progressTemplate;
    @CommandLine.Option(names = "--verbose")
    private boolean verbose;
    @CommandLine.Option(names = "--dump-pages")
    private boolean dumpPages;
    @CommandLine.Option(names = "--write-pages")
    private boolean writePages;
    @CommandLine.Option(names = "--print-traffic")
    private boolean printTraffic;
}
