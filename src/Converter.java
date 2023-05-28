public class Converter {

    int convertToKm(int sumSteps) {
        return sumSteps * 75 / 100000;
    }

    int convertStepsToKilocalories(int sumSteps) {
        return sumSteps * 50 / 1000;
    }

    int averageStepsPerMonth (int sumSteps) {
       return sumSteps / 30;
    }
}
