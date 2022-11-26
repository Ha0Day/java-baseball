package baseball;

import java.util.ArrayList;
import java.util.List;

public class ValidateInput {

    public final static int SIZE = 3;
    public final static String ERROR_MESSAGE = "[ERROR] ";
    public final static String RESTART_GAME = "1";
    public final static String END_GAME = "2";

    public static List<Integer> validateNum(String input) throws IllegalArgumentException {
        List<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (number.contains(input.charAt(i) - '0')) {
                throw new IllegalArgumentException(ERROR_MESSAGE + "중복되지 않는 숫자를 입력해야 합니다.");
            }
            number.add(input.charAt(i) - '0');
        }
        if (number.size() != SIZE) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "숫자 3개를 입력해야 합니다.");
        }
        for (int i = 0; i < SIZE; i++) {
            if (!(1 <= number.get(i) && number.get(i) <= 9)) {
                throw new IllegalArgumentException(ERROR_MESSAGE + "1부터 9까지의 숫자를 입력해야 합니다.");
            }
        }
        return player;
    }

    public static String validateCommand(String command) {
        if (!(command.equals(RESTART_GAME) || command.equals(END_GAME))) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "1 또는 2를 입력해야 합니다.");
        }
        return command;
    }
}
