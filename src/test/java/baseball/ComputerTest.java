package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    @Test
    void 상대방_수_테스트() {
        List<Integer> computer = new Computer().getComputer();
        String input = "";
        for (int i = 0; i < computer.size(); i++) {
            input += computer.get(i) + "";
        }
        assertThat(ValidateInput.validateNum(input)).isEqualTo(computer);
    }
}
