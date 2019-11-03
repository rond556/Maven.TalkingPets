package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
/*
Tests created by Brandon Chambers
*/
public class CatTest {

    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat("Bill", "Grey Cat");
        String expected = "Meow";

        //When
        String actual = cat.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given
        Cat cat = new Cat("Johnathan", "Grey");
        String expected = "Johnathan";

        //When
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        Cat cat = new Cat(null, "Grey");
        String expected = "Johnathan";

        //When
        cat.setName("Johnathan");

        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        //Given
        Cat cat = new Cat(null, "Grey");
        String expected = "Grey";

        //When
        String actual = cat.getType();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTypeTest() {
        //Given
        Cat cat = new Cat(null, "Grey");
        String expected = "Grey";

        //When
        cat.setType("Grey");

        //Then
        String actual = cat.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        //Given
        Cat cat = new Cat("Johnathan", "Grey");
        String expected = "Pets{name='Johnathan', type='Grey'}";

        //When
        String actual = cat.toString();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
