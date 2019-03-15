import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyKeeperTest {

    KeyKeeper key;

    @Before
    public void setUp() throws Exception {

        key =new KeyKeeper(10000,"Siphokuhle","Tyasi");

    }

    @Test
    public void getFirstName() {

        Assert.assertEquals("Siphokuhle",key.getFirstName());
    }



    @Test
    public void getLastName() {
        Assert.assertEquals("Tyasi",key.getLastName());
    }



    @Test
    public void work() {

       assertEquals("Lock all the labs",key.work());

    }



    @Test
    public void duty2() {

    }

    @Test
    public void persformDuties() {
    }


}