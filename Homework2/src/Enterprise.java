

import java.util.ArrayList;


public class Enterprise { //класс предприятие
    public static double inputTargetSum; //определенная сумма (задается вручную)

    public ArrayList<Staff> myStaff = new ArrayList<Staff>(); //создаем ArrayList типизированный сотрудниками

    public void addStaffToEnterprise(Staff addingStaff) { //метод который добавляет сотрудника в ArrayList
        myStaff.add(addingStaff);
    }

    public double getAverageSalaryAllStaff() { //метод вычисляет средний доход сотрудников на предприятии
        double averageSalaryAllStaff;
        double summ = 0;
        for (Staff staff : myStaff) {
            summ += staff.getSalary();
        }
        averageSalaryAllStaff = summ / myStaff.size();
        return averageSalaryAllStaff;
    }

    public void showAllStaffsAboveAverageSalary() { //метод выводит информацию о сотрудниках, чей доход выше среднего на предприятии
        System.out.println("Список сотрудников с зарплатой выше среднего на предприятии:");
        for (Staff staff : myStaff) {
            if (staff.getSalary() > getAverageSalaryAllStaff()) {
                staff.printingStaff();
            }
        }
        System.out.println("~~~~~~~~~~");
    }

    public void showAllStaffsBelowAverageSalary() {  //метод выводит информацию о сотрудниках, чей доход ниже среднего на предприятии
        System.out.println("Список сотрудников с зарплатой ниже среднего на предприятии:");
        for (Staff staff : myStaff) {
            if (staff.getSalary() < getAverageSalaryAllStaff()) {
                staff.printingStaff();
            }
        }
        System.out.println("~~~~~~~~~~");
    }

    public void showAllStaffsAboveAverageTargetSalary() { //метод выводит информацию о сотрудниках, чей доход выше определенной суммы
        System.out.println("Список сотрудников с зарплатой выше суммы " + inputTargetSum);
        for (Staff staff : myStaff) {
            if (staff.getSalary() > inputTargetSum) {
                staff.printingStaff();
            }
        }
        System.out.println("~~~~~~~~~~");
    }

    public void showAllStaffsBelowAverageTargetSalary() { //метод выводит информацию о сотрудниках, чей доход ниже определенной суммы
        System.out.println("Список сотрудников с зарплатой ниже суммы " + inputTargetSum);
        for (Staff staff : myStaff) {
            if (staff.getSalary() < inputTargetSum) {
                staff.printingStaff();
            }
        }
        System.out.println("~~~~~~~~~~");
    }

}