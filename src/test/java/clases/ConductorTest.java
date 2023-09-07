package clases;

import org.junit.Assert;
import org.junit.Test;

public class ConductorTest {
    @Test
    public void testQuePruebaQuePuedoCrearUnConductor(){
        Conductor conductor = new Conductor();
        Assert.assertNotNull(conductor);
    }




}
