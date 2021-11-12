package ca.tresearchgroup.ytdlp.controller;

import ca.tresearchgroup.ytdlp.cli.FilesystemOptions;
import ca.tresearchgroup.ytdlp.cli.Options;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YTDLPService {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static File download(File file, @Nullable Options options, URL... urls) throws IOException, InterruptedException {
        String originalName = file.getName();
        if(options == null) {
            options = new Options();
        }
        if(options.getFilesystemOptions() != null) {
            options.getFilesystemOptions().setOutput(file.getAbsolutePath() + ".%(ext)s");
        } else {
            FilesystemOptions filesystemOptions = new FilesystemOptions();
            filesystemOptions.setOutput(file.getAbsolutePath() + ".%(ext)s");
            options.setFilesystemOptions(filesystemOptions);
        }
        String command = ConfigurationService.YTDLPConfiguration.getBaseCommand() + options + " " + getUrls(urls);
        LOGGER.log(Level.INFO, "Running: " + command);
        Sys.runCommand(command);
        return getFileByName(originalName, new File(file.getAbsolutePath().replace(originalName, "")));
    }

    private static String getUrls(URL... url) {
        StringBuilder stringBuilder = new StringBuilder();
        for(URL theUrl : url) {
            stringBuilder.append(theUrl);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static File getFileByName(String name, File dir) {
        File[] files = dir.listFiles();
        for(File fileInQuestion : files) {
            if(fileInQuestion.getName().contains(name)) {
                return fileInQuestion;
            }
        }
        return null;
    }
}
