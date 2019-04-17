import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    House hs;

    @Before
    public void setUp() throws Exception {
        hs =new House(1,"Round",54,80);
    }
    @Test
    public void getHouseNo() {
        Assert.assertEquals(1,hs.getHouseNo());
    }
    @Test
    public void getShape() {
        Assert.assertEquals("Round",hs.getShape());
    }
    @Test
    public void getCountOfrooms() {
        Assert.assertEquals(54,hs.getCountOfrooms());
    }
    @Test
    public void getDoorNumber() {
        Assert.assertEquals(80,hs.getDoorNumber());
    }
}