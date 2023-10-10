package ReadInputModule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileLines {
    public static ArrayList<String> fileLines() {
        String filePath = "inputs"; // Replace with the actual file path
        ArrayList<String> lines = new ArrayList<String>();
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read lines from the file until the end is reached (null is returned)
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line as needed
                lines.add(line);
                // System.out.println(line);
            }

            // Close the file
            bufferedReader.close();
            System.out.println(lines);
        } catch (IOException e) {
            // Handle file reading errors
            e.printStackTrace();
        }
        return lines;
    }
}