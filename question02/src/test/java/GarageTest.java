import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {
    Garage gar;
    House hs;


    @Before
    public void setUp() throws Exception {
        hs =new House(1,"Round",54,80);
        gar =new Garage("7820","CyfoGrag","White",hs);
    }

    @Test
    public void getId() {
        Assert.assertEquals("7820",gar.getId());
    }

    @Test
    public void getRname() {
        Assert.assertEquals("CyfoGrag",gar.getRname());
    }

    @Test
    public void getRoomColor() {
        Assert.assertEquals("White",gar.getRoomColor());
    }


}