package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {



    public int generateRandomNumber() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if (randomNumber < 4) {
            return 0;
        }
        return randomNumber;
    }

}
