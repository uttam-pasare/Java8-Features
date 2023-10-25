import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee().setName("John").setId(100).setGender("Male").setSalary(25000.00));
        employees.add(new Employee().setName("Alex").setId(101).setGender("Male").setSalary(24000.00));
        employees.add(new Employee().setName("Merry").setId(102).setGender("Female").setSalary(23000.00));
        employees.add(new Employee().setName("Sam").setId(103).setGender("Male").setSalary(26000.00));
        employees.add(new Employee().setName("Angela").setId(104).setGender("Female").setSalary(27000.00));
        return employees;
    }
}