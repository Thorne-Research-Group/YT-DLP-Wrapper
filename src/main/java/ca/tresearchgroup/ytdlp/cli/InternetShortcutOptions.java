package ca.tresearchgroup.ytdlp.cli;

import picocli.CommandLine;

public class InternetShortcutOptions {
    @CommandLine.Option(names = "--write-link")
    private boolean writeLink;
    @CommandLine.Option(names = "--write-url-link")
    private boolean writeUrlLink;
    @CommandLine.Option(names = "--write-webloc-link")
    private boolean writeWeblocLink;
    @CommandLine.Option(names = "--write-desktop-link")
    private boolean writeDesktopLink;
}
