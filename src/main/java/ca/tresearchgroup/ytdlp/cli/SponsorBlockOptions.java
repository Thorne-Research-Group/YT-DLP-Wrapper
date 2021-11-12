package ca.tresearchgroup.ytdlp.cli;

import picocli.CommandLine;

public class SponsorBlockOptions {
    @CommandLine.Option(names = "--sponsorblock-mark")
    private String sponsorblockMark;
    @CommandLine.Option(names = "--sponsorblock-remove")
    private String sponsorblockRemove;
    @CommandLine.Option(names = "--sponsorblock-chapter-title")
    private String sponsorblockChapterTitle;
    @CommandLine.Option(names = "--no-sponsorblock")
    private String noSponsorblock;
    @CommandLine.Option(names = "--sponsorblock-api")
    private String sponsorblockApi;
}
