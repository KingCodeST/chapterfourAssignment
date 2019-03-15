import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

   Employee emp;

    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void getFirstName() {

        Assert.assertEquals(125,emp.getFirstName());
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }
}