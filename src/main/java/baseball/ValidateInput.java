package baseball;

import java.util.ArrayList;
import java.util.List;

public class ValidateInput {

    public final static String ERROR_MESSAGE = "[ERROR] ";

    public static void validatePlayerNum(String playerNum) throws IllegalArgumentException {
        List<Integer> player=new ArrayList<Integer>();

        for(int i=0;i<playerNum.length();i++){
            if(player.contains(playerNum.charAt(i)-'0')){
                throw new IllegalArgumentException(ERROR_MESSAGE + "중복되지 않는 숫자를 입력해야 합니다.");
            }
            player.add(playerNum.charAt(i)-'0');
        }
        if (player.size() != 3) {
            throw new IllegalArgumentException(ERROR_MESSAGE + "숫자 3개를 입력해야 합니다.");
        }
        for (int i = 0; i < player.size(); i++) {
            if (!(1 <= player.get(i) && player.get(i) <= 9)) {
                throw new IllegalArgumentException(ERROR_MESSAGE + "1부터 9까지의 숫자를 입력해야 합니다.");
            }
        }
    }
}
