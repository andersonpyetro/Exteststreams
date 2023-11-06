package javaTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DemoTest {

    @Test
    public void testFilterFemGender() {

        Demo demo = new Demo();

        List<String> result = demo.filterFemGender();

        List<String> expected = Arrays.asList("Cleopatra","Catarina de Siena", "Princesa Isabel", "Irmã Dulce");

        Assert.assertEquals(expected,result);
    }
}