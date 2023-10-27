package racingcar;

public class RacingCar {
    String name;
    int distance;

    public RacingCar(String name, int distance) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.distance = distance;
    }

    public void moveRacingCar() {
        distance += 1;
    }

    public int getDistance() {
        return distance;
    }
}
