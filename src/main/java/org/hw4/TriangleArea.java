package org.hw4;

import net.bytebuddy.implementation.bytecode.Throw;

/**
 * @Author Александр Ключка
 * @created 2022-08-03  19:07
 **/
public class TriangleArea {
    public static void main( String[] args ) throws TriangleAreaIsSideException {
        double a;

        a = triangleArea(3, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has an area of:" + a);

        a = triangleArea(0, 9, 9);
        System.out.println("A triangle with sides 0,9,9 has an area of:" + a );

    }

    public static double triangleArea( double a, double b, double c ) throws TriangleAreaIsSideException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleAreaIsSideException();
        }
        double s = (((a + b + c) / 2) * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        return Math.sqrt(s);
    }
}
