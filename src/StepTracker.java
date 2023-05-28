import java.util.Scanner;

class StepTracer {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    int goalByStepsPerDay = 10000;

    StepTracer(Scanner scan) {
        scanner = scan;

        for (int month = 0; month < monthToData.length; month++) {
            monthToData[month] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month <= 0 || month > 12) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }

        System.out.println("Введите нужный день месяца от 1 до 30 включительно: ");
        int day = scanner.nextInt();
        if (day <= 0 || day > 30) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }

        System.out.println("Введите количество шагов: ");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }

        MonthData monthData = monthToData[month];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Введите вашу цель по шагам на день: ");
        int changeStep = scanner.nextInt();
        if (changeStep <= 0) {
            System.out.println("Введены некорректные данные.");
            return;
        }
        goalByStepsPerDay = changeStep;
    }

    void printStatistic() {
        System.out.println("За какой месяц нужна статистика? Введите от 1 (январь) до 12 (декабрь) включительно: ");
        int month = scanner.nextInt();
        if (month <= 0 || month > 12) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }
        MonthData monthData = monthToData[month - 1];

        monthData.printDaysAndStepsFromMonth();
        System.out.println("Всего в этом месяце вы прошли " + monthData.sumStepsFromMonth() + " шаг.");
        System.out.println("В этом месяцу ваш максимальный показатель шагов в день: " +
                monthData.findMaxSteps() + " шаг.");
        System.out.println("В этом месяце в среднем вы проходили за день " +
                converter.averageStepsPerMonth(monthData.sumStepsFromMonth()) + " шаг.");
        System.out.println("В этом месяце вы прошли " + converter.convertToKm(monthData.sumStepsFromMonth()) + " км");
        System.out.println("За этот месяц вы сожгли " +
                converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()) + " ккал");
        System.out.println("Лучшая серия за месяц: " + monthData.bestSeries(goalByStepsPerDay));
                System.out.println();
    }


}