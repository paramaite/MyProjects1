package ua.org.oa.ishchenko;

public class Staff { //класс работники
    private double salary; //доход сотрудника
    private String position; //должность сотрудника

    public String getPosition() { //метод для получения названия должности
        return position;
    }

    public void setPosition(String position) { //метод для изменения должности

        this.position = position;
    }

    public double getSalary() { //метод для получения суммы дохода сотрудника
        return salary;
    }

    public void setSalary(double salary) { //метод для изменения суммы дохода сотрудника
        if (salary > 0) { //Проверка на коректность ввода суммы дохода сотрудника
            this.salary = salary;
        }
        else{
            System.out.println("Работник не может работать бесплатно!\n" + "Введите число больше нуля");

        }
    }

    Staff(String position, double salary){ //конструктор для создания сотрудников
        setPosition(position);
        setSalary(salary);

    }

    public void printingStaff(){ //метод для вывода информации о сотруднике
        System.out.println(getPosition() + " с зарплатой "+ getSalary());
    }

}