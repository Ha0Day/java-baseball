package baseball;

import java.util.List;

public class Application {

    static boolean retry = true;

    public static void main(String[] args) {
        OutputView.startGame();
        playGame();
    }

    public static void playGame() {
        retry = true;
        Computer computer = new Computer();
        while (retry) {
            List<Integer> player = InputView.readPlayerNum();
            Judge judge = new Judge();
            judge.countSameNumber(computer.getComputer(), player);
        }
    }
}
