package ca.tresearchgroup.ytdlp.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import sun.misc.Unsafe;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sys {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final ObjectMapper OBJECT_MAPPER = JsonMapper.builder().addModule(new AfterburnerModule()).build();
    private static final ObjectMapper NO_NULLS_OBJECT_MAPPER = OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

    static {
        //This hides the illegal reflection access warning
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Unsafe u = (Unsafe) theUnsafe.get(null);

            Class cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field logger = cls.getDeclaredField("logger");
            u.putObjectVolatile(cls, u.staticFieldOffset(logger), null);
        } catch (Exception e) {
            // ignore
        }
    }

    public static String runCommand(String command) throws IOException, InterruptedException {
        List<String> data = runCommandLineByLine(command);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : data) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static List<String> runCommandLineByLine(String command) throws IOException, InterruptedException {
        LOGGER.log(Level.INFO, "Running: " + command);
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        List<String> data = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }
        reader.close();
        process.waitFor();
        process.destroy();
        return data;
    }

    public static String loadFile(File file) throws FileNotFoundException {
        Scanner myReader = new Scanner(file);
        List<String> data = loadFileLineByLine(file);
        StringBuilder stringBuilder = new StringBuilder();
        for(String line : data) {
            stringBuilder.append(line);
        }
        myReader.close();
        return stringBuilder.toString();
    }

    public static List<String> loadFileLineByLine(File file) throws FileNotFoundException {
        Scanner myReader = new Scanner(file);
        List<String> content = new ArrayList<>();
        while (myReader.hasNextLine()) {
            content.add(myReader.nextLine());
        }
        myReader.close();
        return content;
    }

    public static Object getObjectFromJson(String json, Class type) throws JsonProcessingException {
        return OBJECT_MAPPER.readValue(json, type);
    }
}
