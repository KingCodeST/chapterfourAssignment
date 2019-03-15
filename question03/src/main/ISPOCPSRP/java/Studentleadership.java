public class Studentleadership implements StudentRepresentative {

    private String fname ;
    private String lname;
    private int studNo;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStudNo() {
        return studNo;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public Studentleadership(String fname, String lname, int studNo) {
        this.fname = fname;
        this.lname = lname;
        this.studNo = studNo;
    }



///// Interface Segregation Principle
    @Override
    public void salarySRC() {

        System.out.println("10000");
        String  Staff ="30035415";
        System.out.println(Staff);
    }

    /// single Responsibility principle


    @Override
    public  void printPayslip()
    {
        salarySRC();

    }

    @Override
    public void save()
    {
        salarySRC();
    }




}
