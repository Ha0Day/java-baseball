package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    static void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        continueGame(setComputer());
    }

    static List<Integer> setComputer() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    static void continueGame(List<Integer> computer) throws IllegalArgumentException {
        System.out.print("숫자를 입력해주세요 : ");
        List<Integer> user = getUser();

        printResult(computer, user);
    }

    static List<Integer> getUser() {
        List<Integer> user = new ArrayList<>();
        char[] user_chArr = Console.readLine().toCharArray();

        for (char character : user_chArr) {
            int num = character - '0';
            //서로 다른 수가 아닌 경우
            if (user.contains(num)) {
                throw new IllegalArgumentException();
            } else {
                user.add(num);
            }
        }
        //숫자 3개가 아닌 경우
        if (user.size() != 3) throw new IllegalArgumentException();
        //숫자가 아닌 경우
        for (int i = 0; i < 3; i++) {
            if (!(1 <= user.get(i) && user.get(i) <= 9)) {
                throw new IllegalArgumentException();
            }
        }

        return user;
    }
}

