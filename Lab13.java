import java.io.*;
import java.nio.file.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get valid input file path ---
        Path inputPath = null;
        while (inputPath == null) {
            System.out.print("Enter the path to the input file: ");
            String inputFilePath = scanner.nextLine().trim();
            inputPath = Paths.get(inputFilePath);

            if (!Files.exists(inputPath)) {
                System.out.println("Error: File not found. Please try again.");
                inputPath = null;
            }
        }

        // --- Get output file path ---
        System.out.print("Enter the path to the output file: ");
        String outputFilePath = scanner.nextLine().trim();
        Path outputPath = Paths.get(outputFilePath);

        // --- Read input file and count words ---
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split by any non-letter/digit character
                String[] words = line.trim().split("[^a-zA-Z0-9]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        String lowerWord = word.toLowerCase();
                        wordCount.put(lowerWord, wordCount.getOrDefault(lowerWord, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // --- Display results in console ---
        System.out.println("\n--- Results ---");
        System.out.println("File: " + inputPath.getFileName());
        System.out.println("Total word count: " + totalWords);
        System.out.println("\nWord occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("  \"" + entry.getKey() + "\": " + entry.getValue());
        }

        // --- Save results to output file ---
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {
            writer.write("File: " + inputPath.getFileName());
            writer.newLine();
            writer.write("Total word count: " + totalWords);
            writer.newLine();
            writer.newLine();
            writer.write("Word occurrences:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write("  \"" + entry.getKey() + "\": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("\nResults saved to: " + outputPath.getFileName());
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
