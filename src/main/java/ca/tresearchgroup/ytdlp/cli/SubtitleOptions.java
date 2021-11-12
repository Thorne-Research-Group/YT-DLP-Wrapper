package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SubtitleOptions {
    @CommandLine.Option(names = "--write-sub")
    private boolean writeSub;
    @CommandLine.Option(names = "--write-auto-sub")
    private boolean writeAutoSub;
    @CommandLine.Option(names = "--list-subs")
    private boolean listSubs;
    @CommandLine.Option(names = "--sub-format")
    private String subFormat;
    @CommandLine.Option(names = "--sub-lang")
    private String subLang;
}
