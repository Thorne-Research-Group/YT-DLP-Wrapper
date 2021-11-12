package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PostProcessingOptions {
    @CommandLine.Option(names = "--extract-audio")
    private boolean extractAudio;
    @CommandLine.Option(names = "--audio-format")
    private String audioFormat;
    @CommandLine.Option(names = "--audio-quality")
    private String audioQuality;
    @CommandLine.Option(names = "--remux-video")
    private String remuxVideo;
    @CommandLine.Option(names = "--recode-video")
    private String recodeVideo;
    @CommandLine.Option(names = "--postprocessor-args")
    private String postProcessorArgs;
    @CommandLine.Option(names = "--keep-video")
    private String keepVideo;
    @CommandLine.Option(names = "--post-overwrites")
    private String postOverwrites;
    @CommandLine.Option(names = "--embed-subs")
    private String embedSubs;
    @CommandLine.Option(names = "--embed-thumbnail")
    private String embedThumbnail;
    @CommandLine.Option(names = "--embed-metadata")
    private String embedMetadata;
    @CommandLine.Option(names = "--embed-chapters")
    private String embedChapters;
    @CommandLine.Option(names = "--parse-metadata")
    private String parseMetadata;
    @CommandLine.Option(names = "--replace-in-metadata")
    private String replaceInMetadata;
    @CommandLine.Option(names = "--xattrs")
    private String xattrs;
    @CommandLine.Option(names = "--fixup")
    private String fixup;
    @CommandLine.Option(names = "--ffmpeg-location")
    private String ffmpegLocation;
    @CommandLine.Option(names = "--exec")
    private String exec;
    @CommandLine.Option(names = "--exec-before-download")
    private String execBeforeDownload;
    @CommandLine.Option(names = "--convert-subs")
    private String convertSubs;
    @CommandLine.Option(names = "--convert-thumbnails")
    private String convertThumbnails;
    @CommandLine.Option(names = "--split-chapters")
    private String splitChapters;
    @CommandLine.Option(names = "--remove-chapters")
    private String removeChapters;
    @CommandLine.Option(names = "--force-keyframes-at-cuts")
    private String forceKeyframesAtCuts;
    @CommandLine.Option(names = "--use-postprocessor")
    private String usePostProcessor;
}
