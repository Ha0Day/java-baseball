package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    public static List<Integer> readPlayerNum() {
        System.out.print("숫자를 입력해주세요 : ");
        return ValidateInput.validatePlayerNum(Console.readLine());
    }

    public static void readCommand() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if (ValidateInput.validateCommand(Console.readLine()) == 1) {
            Application.playGame();
        }
    }
}
