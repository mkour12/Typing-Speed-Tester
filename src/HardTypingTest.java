
import java.util.Scanner;

public class HardTypingTest extends TypingTest {

    public HardTypingTest(Scanner sc) {
        super(sc);
    }

    @Override
    public String getDifficulty() {
        return "Hard";
    }

    @Override
    public String getParagraph() {
        return "Multithreading enables concurrent execution of "
                + "multiple threads. Synchronization helps prevent "
                + "race conditions when shared resources are accessed.";
    }
}

