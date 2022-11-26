package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest extends NsTest {

    @Test
    void 숫자_비교_테스트() {

        new Judge().countSameNumber(List.of(1, 2, 3), List.of(4, 5, 3));
        assertThat(output()).isEqualTo("1스트라이크");
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}
