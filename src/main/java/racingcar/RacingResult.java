package racingcar;

public class RacingResult {

    RacingCars winningCars;

    public RacingResult(RaceHistory raceHistory) {
        winningCars = raceHistory.getWinningCars();
    }

    public RacingCars getWinningCars() {
        return winningCars;
    }
}
