import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StateCapitalData stateCapitalData = new StateCapitalData();
        String continueQuiz = "yes";

        System.out.println("Welcome to the States and Capitals Quiz!");
        while (continueQuiz.equalsIgnoreCase("yes")) {
            String state = stateCapitalData.getRandomState();
            System.out.println("What is the capital of " + state + "?");
            String answer = scanner.nextLine().trim();

            if (stateCapitalData.checkAnswer(state, answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is: " + stateCapitalData.getCapital(state));
            }

            System.out.print("Do you want to continue? (yes/no): ");
            continueQuiz = scanner.nextLine().trim();
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
