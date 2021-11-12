package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class VideoSelectionOptions {
    @CommandLine.Option(names = "--playlist-start")
    private String playlistStart;
    @CommandLine.Option(names = "--playlist-end")
    private String playlistEnd;
    @CommandLine.Option(names = "--playlist-items")
    private String playlistItems;
    @CommandLine.Option(names = "--max-downloads")
    private String maxDownloads;
    @CommandLine.Option(names = "--min-filesize")
    private String minFileSize;
    @CommandLine.Option(names = "--max-filesize")
    private String maxFileSize;
    @CommandLine.Option(names = "--date")
    private String date;
    @CommandLine.Option(names = "--datebefore")
    private String dateBefore;
    @CommandLine.Option(names = "--dateafter")
    private String dateAfter;
    @CommandLine.Option(names = "--match-filter")
    private String matchFilter;
    @CommandLine.Option(names = "--no-match-filter")
    private boolean noMatchFilter;
    @CommandLine.Option(names = "--yes-playlist")
    private boolean yesPlaylist;
    @CommandLine.Option(names = "--age-limit")
    private String ageLimit;
    @CommandLine.Option(names = "--download-archive")
    private String downloadArchive;
    @CommandLine.Option(names = "--break-on-existing")
    private boolean breakOnExisting;
    @CommandLine.Option(names = "--break-on-reject")
    private boolean breakOnReject;
    @CommandLine.Option(names = "--skip-playlist-after-errors")
    private String skipPlaylistAfterErrors;
    @CommandLine.Option(names = "--no-download-archive")
    private boolean noDownloadArchive;
}
