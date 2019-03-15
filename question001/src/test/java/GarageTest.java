import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {
     Garage gra;

    @Before
    public void setUp() throws Exception {
        gra=new Garage(2,
                "Rectangle",
                4,
                4,
                "One",
                "1836T",
                "Black");
    }

    @Test
    public void getHouseNo() {
        Assert.assertEquals(2,gra.getHouseNo());
    }
    @Test
    public void getShape() {
        Assert.assertEquals("Rectangle",gra.getShape());
    }
    @Test
    public void getCountOfrooms() {
        Assert.assertEquals(4,gra.getCountOfrooms());
    }
    @Test
    public void getDoorNumber() {
        Assert.assertEquals(4,gra.getDoorNumber());
    }
    @Test
    public void getId() {
        Assert.assertEquals("One",gra.getId());
    }
    @Test
    public void getRname() {
        Assert.assertEquals("1836T",gra.getRname());
    }

    @Test
    public void getRoomColor() {
        Assert.assertEquals("Black",gra.getRoomColor());
    }
}