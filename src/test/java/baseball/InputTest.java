package baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest {

    @ParameterizedTest
    @CsvSource(value = {"012:1부터", "112:중복", "d12:1부터","39:3개","9832:3개"}, delimiter = ':')
    void 플레이어_수_테스트(String input,String errorMessage) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException(input))
                        .isInstanceOf(IllegalArgumentException.class).hasMessageContaining(errorMessage)
        );
    }
}
