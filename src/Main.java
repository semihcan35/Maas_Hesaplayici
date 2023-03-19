import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee c1 = new Employee("Semih Can", 1500 , 60 , 20);

        c1.tax();
        c1.bonus();
        c1.raiseSalary();

        System.out.println("İsim: " + c1.name + "\n"+ "Yeni Maaş:" + c1.salary);
    }
}