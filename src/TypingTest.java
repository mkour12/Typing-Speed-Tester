
import java.util.Scanner;

public abstract class TypingTest {

    protected Scanner sc;

    public TypingTest(Scanner sc) {
        this.sc = sc;
    }

    public abstract String getParagraph();

    public abstract String getDifficulty();

    public TestResult startTest() {

        String paragraph = getParagraph();

        System.out.println("\n================================");
        System.out.println("        " + getDifficulty() + " TEST");
        System.out.println("================================");

        System.out.println("\nType the following paragraph:\n");
        System.out.println(paragraph);

        System.out.println("\nPress ENTER when you are ready...");
        sc.nextLine();

        System.out.println("Start typing now!");

        long startTime = System.currentTimeMillis();

        String typedText = sc.nextLine();

        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime;

        double timeInMinutes = timeTaken / 60000.0;

        int wordsTyped = typedText.trim().isEmpty()
                ? 0 : typedText.trim().split("\\s+").length;

        double wpm = timeInMinutes > 0
                ? wordsTyped / timeInMinutes : 0;

        int correctCharacters = 0;

        int minLength = Math.min(paragraph.length(), typedText.length());

        for (int i = 0; i < minLength; i++) {
            if (paragraph.charAt(i) == typedText.charAt(i)) {
                correctCharacters++;
            }
        }

        double accuracy = paragraph.length() > 0
                ? (correctCharacters * 100.0) / paragraph.length()
                : 0;

        return new TestResult(
                getDifficulty(),
                timeTaken / 1000.0,
                wpm,
                accuracy
        );
    }
}
