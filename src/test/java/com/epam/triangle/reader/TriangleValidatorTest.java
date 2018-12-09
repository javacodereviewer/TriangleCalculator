package com.epam.triangle.reader;

import com.epam.triangle.creator.TriangleValidator;
import com.epam.triangle.entity.Point2D;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleValidatorTest {
    public static TriangleValidator VALIDATOR = new TriangleValidator();

@Test
    public void expectNotValidDataAndReturnFalse()   {
   Point2D[] fistPoints = {new Point2D(1,2) , new Point2D(1,2) , new Point2D(1,4) };
    Point2D[] SecodPoints = {new Point2D(0,0) , new Point2D(23,-2) , new Point2D(21,2), new Point2D(11,2)};
    Point2D[] TreePoints = {new Point2D(0,0) , new Point2D(2,2) , new Point2D(4,4)};


    Assert.assertFalse(VALIDATOR.isValid(fistPoints));
    Assert.assertFalse(VALIDATOR.isValid(SecodPoints));
    Assert.assertFalse(VALIDATOR.isValid(TreePoints));

}

    @Test
    public void expectValidDataAndReturnTrue()   {
        Point2D[] fistPoints = {new Point2D(1,2) , new Point2D(3,4) , new Point2D(10,4) };
        Point2D[] SecodPoints = {new Point2D(0,0) , new Point2D(23,32) , new Point2D(21,2)};
        Point2D[] TreePoints = {new Point2D(0,0) , new Point2D(3,0) , new Point2D(0,3)};


        Assert.assertTrue(VALIDATOR.isValid(fistPoints));
        Assert.assertTrue(VALIDATOR.isValid(SecodPoints));
        Assert.assertTrue(VALIDATOR.isValid(TreePoints));

    }

}
