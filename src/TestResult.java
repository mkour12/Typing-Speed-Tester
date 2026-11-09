
public class TestResult {

    private String difficulty;
    private double timeTaken;
    private double wpm;
    private double accuracy;

    public TestResult(String difficulty, double timeTaken,
                      double wpm, double accuracy) {

        this.difficulty = difficulty;
        this.timeTaken = timeTaken;
        this.wpm = wpm;
        this.accuracy = accuracy;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public double getTimeTaken() {
        return timeTaken;
    }

    public double getWpm() {
        return wpm;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void displayResult() {

        System.out.println("\n================================");
        System.out.println("          TEST RESULTS");
        System.out.println("================================");

        System.out.printf("Difficulty   : %s%n", difficulty);
        System.out.printf("Time Taken   : %.2f seconds%n", timeTaken);
        System.out.printf("Typing Speed : %.2f WPM%n", wpm);
        System.out.printf("Accuracy     : %.2f%%%n", accuracy);

        System.out.println("================================");
    }
}
