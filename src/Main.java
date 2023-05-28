import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracer stepTracer = new StepTracer(scanner);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracer.changeStepGoal();
            } else if (command == 2) {
                stepTracer.addNewNumberStepsPerDay();
            } else if (command == 3) {
                stepTracer.printStatistic();
            } else if (command == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Извините, такой команды нет.");
            }
        }
    }

     static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Поставить/изменить цель по количеству шагов за день");
        System.out.println("2 - Ввести количество шагов за день");
        System.out.println("3 - Показать стастистику за месяц");
        System.out.println("0 - Выйти из приложения");
    }
}