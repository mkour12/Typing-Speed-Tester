
import java.util.Scanner;

public class EasyTypingTest extends TypingTest {

    public EasyTypingTest(Scanner sc) {
        super(sc);
    }

    @Override
    public String getDifficulty() {
        return "Easy";
    }

    @Override
    public String getParagraph() {
        return "Java is a popular programming language. "
                + "It is used to build many applications.";
    }
}

