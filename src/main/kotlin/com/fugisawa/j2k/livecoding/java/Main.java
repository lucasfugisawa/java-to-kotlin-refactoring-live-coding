package com.fugisawa.j2k.livecoding.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final Collection<Point> thePoints = new HashSet<>() {{
            add(new Point(1, 1));
            add(new Point(2, 2));
            add(new Point(3, 3));
            add(new Point(4, 4));
            add(new Point(5, 5));
        }};

        final Circle circle = new Circle(new Point(2, 2), 1);

        final long count = numberOfInscribedPoints(circle, thePoints);
        final var inscribedPoints = inscribedPoints(circle, thePoints);

        System.out.println("Number of inscribed points: " + count);
        System.out.println("Inscribed points: " + inscribedPoints);
    }

    private static long numberOfInscribedPoints(Circle circle, Collection<Point> points) {
        return inscribedPoints(circle, points).size();
    }

    private static Collection<Point> inscribedPoints(Circle circle, Collection<Point> points) {
        return points.stream()
                .filter(point -> circle.contains(point))
                .collect(Collectors.toSet());
    }
}
