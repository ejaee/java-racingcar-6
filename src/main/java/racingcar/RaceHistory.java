package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceHistory {
    private RacingCars winningCars = new RacingCars(new ArrayList<>());

    public RacingCars getWinningCars() {
        return winningCars;
    }

    public void recordHistory(RacingCars racingCars) {
        getWinner(racingCars);
    }

    private void getWinner(RacingCars racingCars) {
        int max = 0;
        for (RacingCar racingCar : racingCars) {
            if (racingCar.distance > max) {
                max = racingCar.distance;
                winningCars = new RacingCars(List.of(racingCar));
            } else if (racingCar.distance == max) {
                winningCars.addRacingCar(racingCar);
            }
        }
    }


}
