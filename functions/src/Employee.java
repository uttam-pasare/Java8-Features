public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private Double salary;

    public Employee(){}
    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Employee setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.getId(), this.getName(), this.getGender(), this.getSalary());
    }
}