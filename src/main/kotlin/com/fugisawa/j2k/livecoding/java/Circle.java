package com.fugisawa.j2k.livecoding.java;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Circle {
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        Objects.requireNonNull(center, "center must not be null");
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center) {
        this(center, 1);
    }

    public Point getCenter() { return center; }
    public int getRadius() { return radius; }

    public boolean contains(Point point) {
        return center.distanceTo(point) <= radius;
    }

    public Collection<Point> inscribedPoints(Collection<Point> points) {
        return points.stream()
                .filter(this::contains)
                .collect(Collectors.toSet());
    }

    public long numberOfInscribedPoints(Collection<Point> points) {
        return inscribedPoints(points).size();
    }

    public Point aRandomInscribedPoint(Collection<Point> points) {
        return inscribedPoints(points).stream()
                .findAny()
                .orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        if (radius != circle.radius) return false;
        return Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
