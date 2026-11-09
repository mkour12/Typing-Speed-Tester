
import java.io.*;

public class ResultStorage {

    private static final String FILE_NAME = "results.txt";

    public static void saveResults(ResultManager manager) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (TestResult result : manager.getResults()) {

                String line = result.getDifficulty() + "|"
                        + result.getTimeTaken() + "|"
                        + result.getWpm() + "|"
                        + result.getAccuracy();

                writer.write(line);
                writer.newLine();
            }

            System.out.println("Results saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving results: " + e.getMessage());
        }
    }

    public static void loadResults(ResultManager manager) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 4) {

                    String difficulty = data[0];
                    double time = Double.parseDouble(data[1]);
                    double wpm = Double.parseDouble(data[2]);
                    double accuracy = Double.parseDouble(data[3]);

                    TestResult result = new TestResult(
                            difficulty, time, wpm, accuracy
                    );

                    manager.addResult(result);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading results: " + e.getMessage());
        }
    }
}

