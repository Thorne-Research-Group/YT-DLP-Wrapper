package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FilesystemOptions {
    @CommandLine.Option(names = "--batch-file")
    private String batchFile;
    @CommandLine.Option(names = "--paths")
    private String paths;
    @CommandLine.Option(names = "--output")
    private String output;
    @CommandLine.Option(names = "--output-na-placeholder")
    private String outputNaPlaceHolder;
    @CommandLine.Option(names = "--restrict-filenames")
    private String restrictFileNames;
    @CommandLine.Option(names = "--windows-filenames")
    private String windowsFileNames;
    @CommandLine.Option(names = "--trim-filenames")
    private String trimFileNames;
    @CommandLine.Option(names = "--no-overwrites")
    private String noOverWrites;
    @CommandLine.Option(names = "--force-overwrites")
    private String forceOverWrites;
    @CommandLine.Option(names = "--continue")
    private String continueDownload;
    @CommandLine.Option(names = "--part")
    private String part;
    @CommandLine.Option(names = "--mtime")
    private String mTime;
    @CommandLine.Option(names = "--write-description")
    private String writeDescription;
    @CommandLine.Option(names = "--write-info-json")
    private String writeInfoJson;
    @CommandLine.Option(names = "--write-playlist-metafiles")
    private String writePlaylistMetaFiles;
    @CommandLine.Option(names = "--clean-infojson")
    private String cleanInfoJson;
    @CommandLine.Option(names = "--write-comments")
    private String writeComments;
    @CommandLine.Option(names = "--load-info-json")
    private String loadInfoJson;
    @CommandLine.Option(names = "--cookies")
    private String cookies;
    @CommandLine.Option(names = "--cookies-from-browser")
    private String cookiesFromBrowser;
    @CommandLine.Option(names = "--cache-dir")
    private String cacheDir;
    @CommandLine.Option(names = "--rm-cache-dir")
    private String rmCacheDir;
}
