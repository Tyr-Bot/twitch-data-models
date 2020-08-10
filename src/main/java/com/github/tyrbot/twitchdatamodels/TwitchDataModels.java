package com.github.tyrbot.twitchdatamodels;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.io.Resources;

public class TwitchDataModels {
    
    public final static String VERSION;

    static {
        String versionBuffer;
        try {
            List<String> gradleConfigLines = Resources.readLines(Resources.getResource("gradleConfig"),
                    Charset.forName("utf-8"));
            Map<String, String> configStore = new HashMap<>();
            gradleConfigLines.forEach(line -> {
                String[] values = line.split("=");
                configStore.put(values[0], values[1]);
            });

            versionBuffer = configStore.get("version");
        } catch (IOException ex) {
            ex.printStackTrace();
            versionBuffer = "UNKNOWN";
        }

        VERSION = versionBuffer;
    }

}