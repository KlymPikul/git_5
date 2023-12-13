public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Klyv", "Pikul", 34);

        // Выводим информацию на экран
        System.out.printf("First Name: %s\n", employee.getFirstName());
        System.out.printf("Last Name: %s\n", employee.getLastName());
        System.out.printf("Age: %d\n", employee.getAge());
    }
    }

