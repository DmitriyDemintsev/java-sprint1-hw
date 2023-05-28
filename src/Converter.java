public class Converter {

    static int convertToKm(int sumSteps) {
        int passToKm = sumSteps * 75 / 100000;
        return passToKm;
    }

    int convertStepsToKilocalories(int sumSteps) {
        int caloriesSpent = sumSteps * 50 / 1000;
        return caloriesSpent;
    }

    int averageStepsPerMonth (int sumSteps) {
       int averageSteps = sumSteps / 30;
       return averageSteps;
    }
}
