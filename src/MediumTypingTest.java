
import java.util.Scanner;

public class MediumTypingTest extends TypingTest {

    public MediumTypingTest(Scanner sc) {
        super(sc);
    }

    @Override
    public String getDifficulty() {
        return "Medium";
    }

    @Override
    public String getParagraph() {
        return "Object oriented programming helps developers "
                + "organize code using classes and objects. "
                + "Java supports inheritance and polymorphism.";
    }
}

