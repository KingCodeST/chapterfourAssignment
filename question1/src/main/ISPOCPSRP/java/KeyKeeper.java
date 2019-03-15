
///open close principle its open for extension and close for modification

public class KeyKeeper  extends Employee  {


    private double salary;

    public KeyKeeper(double s,String firstName,String lastName)
    {
        super( firstName, lastName);
        salary =s;
    }



    public String work()
    {
        String message="Lock all the labs";
        return message;
    }


    public void duty2()
    {
        System.out.println("Store Keys ");
    }

    @Override
    public void persformDuties() {

        work();
        duty2();

    }
}
