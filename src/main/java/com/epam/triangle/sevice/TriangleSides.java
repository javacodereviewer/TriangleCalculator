package com.epam.triangle.sevice;

import com.epam.triangle.entity.Point2D;
import com.epam.triangle.entity.Triangle;

public class TriangleSides {

    private DistanceCalculator distanceCalculator;
    public TriangleSides(DistanceCalculator distanceCalculator){
        this.distanceCalculator = distanceCalculator;
    }



    public double[] getAll(Triangle triangle){
            Point2D[] points = triangle.getAllPoints();
            double[] sides = new double[3];

            for(int i =0;i<sides.length;++i){
                Point2D pointOne = points[i %3];
                Point2D pointTwo = points[(i+1) % 3];
                sides[i] = distanceCalculator.calculateDistance(pointOne,pointTwo);
            }
            return sides;
    }

}
