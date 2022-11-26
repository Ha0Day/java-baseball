package baseball;

public class OutputView {

    public final static int SUCCESS = 3;

    public static void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(int count, int strike) {
        if (count == 0) {
            System.out.println("낫싱");
            return;
        }
        if (strike == 0) {
            System.out.println(count + "볼");
            return;
        }
        if (strike != SUCCESS && strike == count) {
            System.out.println(strike + "스트라이크");
            return;
        }
        if (strike != SUCCESS) {
            System.out.println((count - strike) + "볼 " + strike + "스트라이크");
            return;
        }
        System.out.println("3스트라이크\n" +
                "3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
