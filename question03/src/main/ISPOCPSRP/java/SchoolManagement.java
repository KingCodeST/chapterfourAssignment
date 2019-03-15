public class SchoolManagement implements ManagementPayable {

    public void callEmployee(Employee emp)
    {

            emp.persformDuties();

    }

//// Interface Segregation Principle
    @Override
    public void salaryMP() {

        System.out.println("50000");
        String staff ="30058451";
        System.out.println(staff);
    }
}
