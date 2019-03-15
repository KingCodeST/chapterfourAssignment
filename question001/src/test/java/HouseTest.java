import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    House hr;

    @Before
    public void setUp() throws Exception {
        hr=new House(5214,
                     "Box",
                     5,
                     5
                      );
    }
    @Test
    public void getHouseNo() {
        Assert.assertEquals(5214,hr.getHouseNo());
    }
    @Test
    public void getShape() {
        Assert.assertEquals("Box",hr.getShape());
    }
    @Test
    public void getCountOfrooms() {
        Assert.assertEquals(5,hr.getCountOfrooms());
    }
    @Test
    public void getDoorNumber() {
        Assert.assertEquals(5,hr.getDoorNumber());
    }
}