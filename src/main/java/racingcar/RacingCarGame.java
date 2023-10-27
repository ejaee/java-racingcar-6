package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.StringJoiner;

public class RacingCarGame {

    private RacingCarGameService racingCarGameService;

    public RacingCarGame() {
        racingCarGameService = new RacingCarGameService();
    }

    public void run() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarsName = Console.readLine();
        RacingCars racingCars = new RacingCars(racingCarGameService.createRacingCar(inputCarsName));

        System.out.println("시도할 회수는 몇회인가요?");
        String inputRound = Console.readLine();
        GameRound gameRound = racingCarGameService.generateRound(inputRound);

        RacingResult racingResult = racingCarGameService.race(racingCars, gameRound, new RandomNumberGenerator());

        StringJoiner sj = new StringJoiner(", ");
        for (RacingCar racingCar : racingResult.getWinningCars()) {
            sj.add(racingCar.name);
        }
        System.out.print("최종 우승자 : ");
        System.out.println(sj);
    }
}
