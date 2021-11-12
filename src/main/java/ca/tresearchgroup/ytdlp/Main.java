package ca.tresearchgroup.ytdlp;

import ca.tresearchgroup.ytdlp.cli.Options;
import ca.tresearchgroup.ytdlp.controller.ConfigurationService;
import ca.tresearchgroup.ytdlp.controller.Sys;
import ca.tresearchgroup.ytdlp.model.YTDLP;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "ca/tresearchgroup/ytdlp", mixinStandardHelpOptions = true)
public class Main extends Options implements Callable<Integer> {
    private static String[] programArugments;

    public static void main(String[] args) {
        programArugments = args;
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        String json = Sys.runCommand(ConfigurationService.YTDLPConfiguration.getBaseCommand() + " " + assembleArguments(programArugments));
        try {
            YTDLP YTDLP = (YTDLP) Sys.getObjectFromJson(json, YTDLP.class);
            System.out.println(json);
        } catch (UnrecognizedPropertyException ex) {
            System.out.println(json);
            ex.printStackTrace();
        }
        return null;
    }

    public String assembleArguments(String[] args) {
        StringBuilder argsBuilder = new StringBuilder();
        for(String arg : args) {
            argsBuilder.append(arg);
            argsBuilder.append(" ");
        }
        return argsBuilder.toString();
    }
}
