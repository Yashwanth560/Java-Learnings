import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?\n1. Berlin 2. Madrid 3. Paris 4. Rome",
            "Which is the largest planet in the solar system?\n1. Mars 2. Jupiter 3. Saturn 4. Venus",
            "What is the square root of 64?\n1. 6 2. 7 3. 8 4. 9"
        };
        int[] answers = {3, 2, 3}; // Correct answers
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("Your total score: " + score + "/" + questions.length);
        scanner.close();
    }
}
