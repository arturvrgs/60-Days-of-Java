package OOP.MathQuizGame;

import java.util.Scanner;

public class MathQuiz {
    private int score = 0;

    public void startQuiz() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            askQuestion(scan);
        }
    }

    public void askQuestion(Scanner scan) {
        Question question = new Question();
        question.generateQuestion();

        double userAnswer = scan.nextDouble();

        if(!question.checkAnswer(userAnswer)) {
            System.out.println("Incorrect");
            return;
        }

        System.out.println("Correct!");
        this.score++;


    }
}
