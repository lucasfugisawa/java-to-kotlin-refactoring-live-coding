package br.com.fugisawa.j2k.livecoding.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        final Set<Point> thePoints = new HashSet<>() {{
            add(new Point(1, 1));
            add(new Point(2, 2));
            add(new Point(3, 3));
            add(new Point(4, 4));
            add(new Point(5, 5));
        }};

        final Circle c1 = new Circle(new Point(2, 2), 1);

        final long count = numberOfInscribedPoints(c1, thePoints);
        System.out.println("Number of inscribed points: " + count);
    }

    private static long numberOfInscribedPoints(Circle circle, Collection<Point> points) {
        return points.stream()
                .filter(point -> circle.contains(point))
                .count();
    }
}
