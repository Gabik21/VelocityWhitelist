package com.james090500.VelocityWhitelist.helpers;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.james090500.VelocityWhitelist.VelocityWhitelist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public record MinecraftApi(VelocityWhitelist velocityWhitelist) {

    /**
     * Returns player UUID
     *
     * @param username Username to get UUID from
     * @return Players uuid
     */
    public UUID getUUID(String username) {
        return UUIDFetcher.getUUID(username);
    }

}