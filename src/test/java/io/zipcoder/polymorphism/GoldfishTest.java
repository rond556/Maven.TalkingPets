package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class GoldfishTest {

    @Test
    public void speakTest(){
        //Given
        Goldfish goldie = new Goldfish(null,null);
        String expected = "Glub";

        //When
        String actual = goldie.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
