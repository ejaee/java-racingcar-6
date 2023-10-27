package racingcar;

import java.util.Iterator;
import java.util.List;

public class RacingCars implements Iterable<RacingCar> {

    List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public void addRacingCar(RacingCar racingCar) {
        racingCars.add(racingCar);
    }

    @Override
    public Iterator<RacingCar> iterator() {
        return racingCars.iterator();
    }

}
