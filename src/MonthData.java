public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int day : days) {
            sumSteps = day + sumSteps;
        }
        return sumSteps;
    }

    int findMaxSteps() {
        int maxStep = 0;
        for (int day : days) {
            if (day > maxStep) {
                maxStep = day;
            }

        }
        return maxStep;
    }

    int bestSeries(int goalByStepsPerDay) {
        int countSeries = 0;
        int bestSeries = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                countSeries = countSeries + 1;
                if (countSeries > bestSeries) {
                    bestSeries = countSeries;
                }
            }

        }
        return bestSeries;
    }
}
