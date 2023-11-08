package com.fugisawa.j2k.livecoding.java;

import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        final Collection<Point> points = new HashSet<>() {{
            add(new Point(1, 1));
            add(new Point(2, 2));
            add(new Point(3, 3));
            add(new Point(4, 4));
            add(new Point(5, 5));
        }};

        final Circle circle = new Circle(new Point(2, 2), 1);

        final long count = circle.numberOfInscribedPoints(points);
        final Collection<Point> inscribedPoints = circle.inscribedPoints(points);
        final Point aRandomInscribedPoint = circle.aRandomInscribedPoint(points);

        System.out.println("Inscribed points: " + inscribedPoints);
        System.out.println("Number of inscribed points: " + count);

        if (aRandomInscribedPoint != null) {
            System.out.println("A random inscribed point: " + aRandomInscribedPoint);
            doSomethingWithPoint(aRandomInscribedPoint);
        } else {
            throw new IllegalStateException("aRandomInscribedPoint is null");
        }

    }

    public static void doSomethingWithPoint(Point point) {
        System.out.println("X is " + point.getX());
        System.out.println("Y is " + point.getY());
    }
}
