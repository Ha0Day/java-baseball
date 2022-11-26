package baseball;

import java.util.List;

public class Judge {

    public void countSameNumber(List<Integer> computer, List<Integer> player) {
        int count = 0;
        for (int i = 0; i < computer.size(); i++) {
            if (computer.contains(player.get(i))) {
                count++;
            }
        }
        comparePosition(computer, player, count);
    }

    public void comparePosition(List<Integer> computer, List<Integer> player, int count) {

        int strike = 0;
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(player.get(i))) {
                strike++;
            }
        }
        OutputView.printResult(count, strike);
    }
}