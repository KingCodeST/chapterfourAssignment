// open close principle its open for extension and close for modification

public class Teacher extends Employee {


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Teacher(double s,String firstName,String lastName)
    {
        super(firstName,lastName);
        salary =s;

    }


    public void teach()
    {
        System.out.println("Teach student");
    }


    @Override
    public void persformDuties() {
        teach();

    }
}
