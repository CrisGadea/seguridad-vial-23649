package clases;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

    @Test
    public void testQuePruebaQuePuedoCrearUnAuto(){
        Auto auto = new Auto();
        Assert.assertNotNull(auto);
    }


}
