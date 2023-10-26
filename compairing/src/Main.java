import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();

        System.out.println("--------------- Before sorting -------------");
        employees.forEach(employee -> System.out.println(employee.toString()));

        System.out.println("--------------- After sorting by employee.id -------------");
        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("--------------- After sorting by salary reversed -------------");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);


        System.out.println("Get highest paid employee name");
        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get().getName());
        System.out.println(employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getName());

    }
}