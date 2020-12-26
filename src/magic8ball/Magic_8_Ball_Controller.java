package magic8ball;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Random;

public class Magic_8_Ball_Controller {

    private Random random;
    private ArrayList<String> answers;
    public TextArea answer;
    public Button question_button;

    public Magic_8_Ball_Controller() {
        random = new Random();
        answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("I won't answer that now");
        answers.add("Most definitely");
        answers.add("Most definitely not");
        answers.add("You know the answer yourself");
    }

    public void ask() {
        int randomIndex = (int) (Math.random() * answers.size());
        answer.setText(answers.get(randomIndex));
    }
}
