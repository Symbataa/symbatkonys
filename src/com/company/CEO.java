public class CEO extends Employee{
    private int salary;

    public CEO()
    {

    }
    public CEO(String firstName, String secondName, String gender, int age, int salary)
    {
        super(firstName, secondName, gender, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override //own implementation of toString method for CEO. (Polymorphism)
    public String toString() {
        return "CEO{" + super.toString() +
                " salary=" + salary +
                '}';
    }
}

