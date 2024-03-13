package stream;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a new file named newfile.txt with some content
        try (PrintWriter writer = new PrintWriter("newfile.txt")) {
            writer.println("Hello, this is some content for the new file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Get a list of files in the current directory
        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles();
        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                fileNames.add(file.getName());
            }
        }

        // Sort the file names in alphabetical order
        Collections.sort(fileNames);

        // Print the sorted file names
        StringBuilder output = new StringBuilder();
        for (String fileName : fileNames) {
            output.append(fileName).append(", ");
        }

        // Remove characters from the final output that appear in the ChallengeToken
        String challengeToken = "mwilohej95";
        output = new StringBuilder(output.toString().replaceAll("(?i)[" + challengeToken + "]", ""));
        output = new StringBuilder(output.toString().replaceAll(",\\s*$", ""));

        // Print the final output
        System.out.println(output.toString().isEmpty() ? "EMPTY" : output.toString());
    }
}
