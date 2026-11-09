
import java.util.ArrayList;

public class ResultManager {

    private ArrayList<TestResult> results;

    public ResultManager() {
        results = new ArrayList<>();
    }

    public void addResult(TestResult result) {
        results.add(result);
    }

    public void displayHistory() {

        if (results.isEmpty()) {
            System.out.println("\nNo previous test results found.");
            return;
        }

        System.out.println("\n========== TEST HISTORY ==========");

        for (int i = 0; i < results.size(); i++) {

            System.out.println("\nAttempt " + (i + 1));

            results.get(i).displayResult();
        }
    }

    public ArrayList<TestResult> getResults() {
        return results;
    }
}

