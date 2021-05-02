# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 기능 요구사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 기능 구현사항
* 경주에 참여할 자동차 이름을 입력받아 n개의 자동차를 생성한다.
* 자동차의 이름이 5자 이하인지 유효성을 검사한다.
* 사용자에게 몇 번의 이동을 할 것인지 입력받는다.
* 자동차별 랜덤하게 0~9 사이의 random 값으로 4이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 한번 이동을 할 때마다 자동차 이름별로 얼마나 전진했는지 화면에 출력한다.
* 이동이 다 끝난 후, 우승한 차 이름을 출력한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
