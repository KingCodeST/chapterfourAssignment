// open close principle its open for extension and close for modification

abstract class Employee  {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;


    public Employee(String fn,String ln)
    {
        firstName =fn;
        lastName =ln;

    }



    public abstract void persformDuties();




}
