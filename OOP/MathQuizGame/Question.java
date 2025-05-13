package OOP.MathQuizGame;

import java.util.Random;

public class Question {

    private int leftOperand;
    private int rightOperand;
    private char operator;
    private double correctAnswer;
    private char[] operators;


    public Question() {

        Random random = new Random();
        this.leftOperand = random.nextInt(2,11);
        this.rightOperand = random.nextInt(2,11);
        char[] operators = new char[]{'+', '-', '/', '*'};
        this.operator = operators[random.nextInt(0, operators.length)];

        calculateAnswer();
    }

    private void calculateAnswer() {
        if (operator == '+') {
            this.correctAnswer = leftOperand + rightOperand;
        }

        if (operator == '-') {
            this.correctAnswer = leftOperand - rightOperand;
        }

        if (operator == '*') {
            this.correctAnswer = leftOperand * rightOperand;
        }

        if (operator == '/') {
            this.correctAnswer = (double)(leftOperand / rightOperand);
        }
    }

    public void generateQuestion() {
        System.out.println("What is: " + leftOperand + operator + rightOperand + "?");
    }

    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001;
    }
}
