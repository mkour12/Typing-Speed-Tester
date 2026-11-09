
import java.util.Scanner;

public class TypingSpeedTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ResultManager manager = new ResultManager();

        ResultStorage.loadResults(manager);

        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("       TYPING SPEED TESTER");
            System.out.println("================================");

            System.out.println("1. Start Typing Test");
            System.out.println("2. View Test History");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:

                        System.out.println("\nSelect Difficulty:");
                        System.out.println("1. Easy");
                        System.out.println("2. Medium");
                        System.out.println("3. Hard");

                        System.out.print("Enter choice: ");

                        int level = Integer.parseInt(sc.nextLine());

                        TypingTest test;

                        switch (level) {

                            case 1:
                                test = new EasyTypingTest(sc);
                                break;

                            case 2:
                                test = new MediumTypingTest(sc);
                                break;

                            case 3:
                                test = new HardTypingTest(sc);
                                break;

                            default:
                                System.out.println("Invalid difficulty.");
                                continue;
                        }

                        TestResult result = test.startTest();

                        result.displayResult();

                        manager.addResult(result);

                        ResultStorage.saveResults(manager);

                        break;

                    case 2:

                        manager.displayHistory();

                        break;

                    case 3:

                        running = false;
                        System.out.println("Thank you for using Typing Speed Tester!");

                        break;

                    default:

                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");

            }
        }

        sc.close();
    }
}

