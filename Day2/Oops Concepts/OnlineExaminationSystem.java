class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}

class Quiz {
    List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.questionText);
            for (int i = 0; i < question.options.length; i++) {
                System.out.println((i + 1) + ". " + question.options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (question.isCorrect(answer)) {
                score++;
            }
        }
        System.out.println("Quiz finished! Your score: " + score + "/" + questions.size());
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Rome"}, 1));
        quiz.addQuestion(new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 2));
        quiz.start();
    }
}
