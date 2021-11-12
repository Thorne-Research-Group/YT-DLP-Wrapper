package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Options {
    @CommandLine.ArgGroup(heading = "General variables\n", exclusive = false)
    private GeneralOptions generalOptions = new GeneralOptions();
    @CommandLine.ArgGroup(heading = "Geo Restriction variables\n", exclusive = false)
    private GeoRestrictionOptions geoRestrictionOptions = new GeoRestrictionOptions();
    @CommandLine.ArgGroup(heading = "Video Selection variables\n", exclusive = false)
    private VideoSelectionOptions videoSelectionOptions = new VideoSelectionOptions();
    @CommandLine.ArgGroup(heading = "Download variables\n", exclusive = false)
    private DownloadOptions downloadOptions = new DownloadOptions();
    @CommandLine.ArgGroup(heading = "File system variables\n", exclusive = false)
    private FilesystemOptions filesystemOptions = new FilesystemOptions();
    @CommandLine.ArgGroup(heading = "Thumbnail variables\n", exclusive = false)
    private ThumbnailOptions thumbnailOptions = new ThumbnailOptions();
    @CommandLine.ArgGroup(heading = "Simulation variables\n", exclusive = false)
    private SimulationOptions simulationOptions = new SimulationOptions();
    @CommandLine.ArgGroup(heading = "Workaround variables\n", exclusive = false)
    private WorkaroundOptions workaroundOptions = new WorkaroundOptions();
    @CommandLine.ArgGroup(heading = "Video format variables\n", exclusive = false)
    private VideoFormatOptions videoFormatOptions = new VideoFormatOptions();
    @CommandLine.ArgGroup(heading = "Subtitle variables\n", exclusive = false)
    private SubtitleOptions subtitleOptions = new SubtitleOptions();
    @CommandLine.ArgGroup(heading = "Authentication variables\n", exclusive = false)
    private AuthenticationOptions authenticationOptions = new AuthenticationOptions();
    @CommandLine.ArgGroup(heading = "Post processing variables\n", exclusive = false)
    private PostProcessingOptions postProcessingOptions = new PostProcessingOptions();

    @CommandLine.Parameters
    private List<String> options;
}
