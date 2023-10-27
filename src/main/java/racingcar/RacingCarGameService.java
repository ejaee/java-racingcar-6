package racingcar;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGameService {

    public List<RacingCar> createRacingCar(String input) {
        String[] racingCarNames = input.split(",");
        List<RacingCar> racingCars = new ArrayList<>();

        for (String racingCarName : racingCarNames) {
            RacingCar racingCar = new RacingCar(racingCarName, 0);
            racingCars.add(racingCar);
        }
        return racingCars;
    }

    public GameRound generateRound(String input) {
        return new GameRound(Integer.parseInt(input));
    }

    public RacingResult race(RacingCars racingCars, GameRound gameRound, RandomNumberGenerator randomNumberGenerator) {
        RaceHistory raceHistory = new RaceHistory();

        System.out.println("실행 결과");
        for (int idx = 0; idx < gameRound.getRound(); idx++) {
            for (RacingCar racingCar : racingCars) {
                if (randomNumberGenerator.generateRandomNumber() != 0) {
                    racingCar.moveRacingCar();
                }
            }
            raceHistory.recordHistory(racingCars);
            announceResult(racingCars);
            System.out.println();
        }
        System.out.println();
        return new RacingResult(raceHistory);
    }

    public void announceResult(RacingCars racingCars) {
        for (RacingCar racingCar : racingCars) {
            System.out.print(racingCar.name);
            System.out.print(" : ");
            for (int idx = 0; idx < racingCar.distance; idx++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }



}
