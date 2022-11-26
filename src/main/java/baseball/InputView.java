package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    public static void readPlayerNum(){
        System.out.print("숫자를 입력해주세요 : ");
        ValidateInput.validatePlayerNum(Console.readLine());
    }
}
