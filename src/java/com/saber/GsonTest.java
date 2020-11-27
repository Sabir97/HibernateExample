package com.saber;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Saber
 */
public class GsonTest {
    
    public static void main(String[] args) throws IOException {
    
    Gson gson = new Gson();
    Users userJson = new Users("Leo",24);
    userJson.setId(14);
    String json = gson.toJson(userJson);
    System.out.println(json);
    Users user2 = gson.fromJson(json, Users.class);
        FileWriter file = new FileWriter("C:\\Users\\Saber\\Desktop\\test.json");
        file.write(json);
        file.close();
        String jsonContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\Saber\\Desktop\\test.json")));
        System.out.println("Read from file : " + jsonContent);
    }
    
}
