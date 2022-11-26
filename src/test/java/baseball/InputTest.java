package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest extends NsTest {

    @ParameterizedTest
    @CsvSource(value = {"012:1부터", "112:중복", "d12:1부터","39:3개","9832:3개"}, delimiter = ':')
    void 플레이어_수_예외_테스트(String input,String errorMessage) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException(input))
                        .isInstanceOf(IllegalArgumentException.class).hasMessageContaining(errorMessage)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "s"})
    void 재시작_종료_여부_예외_테스트(String input) {
        assertThatThrownBy(() ->
                ValidateInput.validateCommand(input))
                .isInstanceOf(IllegalArgumentException.class).hasMessageContaining("1 또는 2를 입력해야 합니다.");
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}
