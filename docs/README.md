### 숫자 야구

## 기능 목록

- [x] 게임을 시작한다. - OutputView#startGame

- [x] 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 생성한다. - Computer#createComputerNum

- [x] 플레이어로부터 숫자를 입력 받는다. - InputView#readPlayerNum
    - 잘못된 값을 입력할 경우 IllegalArgumentException 예외 발생 - ValidateNumber#validatePlayerNum
        - [x] 서로 다른 값이 아닌 경우
        - [x] 숫자가 3개가 아닌 경우
        - [x] 1부터 9까지의 숫자가 아닌 경우

- [ ] 컴퓨터의 수와 플레이어의 수를 비교한다.
    - [x] 일치하는 숫자의 개수를 확인한다. - Judge#countSameNumber
    - [x] 일치하는 숫자의 자리를 확인한다. - Judge#comparePosition
    - [x] 결과를 출력한다. - OutputView#printResult
        - [x] 일치하는 숫자의 개수가 0이면 낫싱 출력
        - [x] 일치하는 숫자가 다른 자리에 있으면 볼 출력
        - [x] 일치하는 숫자가 같은 자리에 있으면 스트라이크 출력

- [ ] 게임이 끝난 경우 재시작/종료 여부를 입력 받는다. - InputView#readCommand
    - 잘못된 값을 입력할 경우 IllegalArgumentException 예외 발생 - ValidateNumber#validateCommand
        - [ ] 1 또는 2가 아닌 경우
    - [ ] 1을 입력 받으면 재시작한다.
    - [ ] 2를 입력 받으면 종료한다.