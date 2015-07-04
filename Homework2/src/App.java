

import java.util.Scanner;

/*
 * Для решения задачи создать java программу, удовлетворяющую следующим требованиям:
 1. Спроектировать базовый класс, содержащий в качестве полей другие классы.
 2. Предусмотреть возможность создания объектов с указанием различных параметров инициализации.
 3. Каждый класс, поле, метод должен иметь название, отражающее его суть и комментарии, описывающие их предназначение.
 4. Продемонстрировать использование перегруженных методов и конструкторов, массивов.
 5. При инициализации полей классов проверять корректность введенных данных.
 6. Создать класс демонстрирующий корректность работы разработанной java программы
 7. На этапе составления программы должны быть использованы соглашения из java code convention.
 8. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
 9. Индивудуальная папка в SVN репозатарии для сохранения выполненных заданий располжена по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>
 10. Опционально: организовать ввод данных с консоли
 Создать классы предприятие и сотрудники. В классе предприятие создать методы для вычисления среднего дохода работников предприятия, выводу на экран всех работников, чей доход:
 выше среднего на данном предприятии;
 выше определенной суммы;
 ниже среднего на данном предприятии;
 ниже определенной суммы.
 */

public class App {

    public static void main(String[] args) {

        Enterprise enterprise1 = new Enterprise(); //создается новое предприятие

        enterprise1.addStaffToEnterprise(new Staff("Director", 6.200)); //создаются новые сотрудники и добавляются в предприятие
        enterprise1.addStaffToEnterprise(new Staff("Accountant", 4.100)); //создаются новые сотрудники и добавляются в предприятие
        enterprise1.addStaffToEnterprise(new Staff("Manager", 3.600)); //создаются новые сотрудники и добавляются в предприятие

        System.out.println("Выбирете пункт:");
        System.out
                .println("1. Вывод сотрудников с доходом выше среднего на предприятии:");
        System.out
                .println("2. Вывод сотрудников с доходом ниже среднего на предприятии:");
        System.out
                .println("3. Вывод сотрудников с доходом выше заданной суммы (дополнительно необходимо ввсети заданную сумму)");
        System.out
                .println("4. Вывод сотрудников с доходом ниже заданной суммы (дополнительно необходимо ввсети заданную сумму)");
        System.out.println();

        Scanner input = new Scanner(System.in); //определен Scanner для выбора действий
        int inputItem = input.nextInt();
        switch (inputItem) {

            case 1:
                enterprise1.showAllStaffsAboveAverageSalary();
                break;

            case 2:
                enterprise1.showAllStaffsBelowAverageSalary();
                break;

            case 3:
                System.out.println("Введите пороговую сумму ");
                Scanner input2 = new Scanner(System.in);
                double inputTargetSum1 = input.nextDouble();
                if (inputTargetSum1 < 0) {
                    System.out.println("Ошибка!!! \n" + "Введите сумму больше нуля");
                } else {
                    Enterprise.inputTargetSum = inputTargetSum1;
                    enterprise1.showAllStaffsAboveAverageTargetSalary();
                }
                break;

            case 4:
                System.out.println("Введите пороговую сумму ");
                Scanner input3 = new Scanner(System.in);
                double inputTargetSum2 = input.nextDouble();
                if (inputTargetSum2 < 0) {
                    System.out
                            .println("Ошибка!!! \n" + "Введите сумму больше нуля");
                } else {
                    Enterprise.inputTargetSum = inputTargetSum2;
                    enterprise1.showAllStaffsBelowAverageTargetSalary();
                }
                break;

            default:
                System.out.println("Вы ввели неверное значение");
                break;
        }

    }
}