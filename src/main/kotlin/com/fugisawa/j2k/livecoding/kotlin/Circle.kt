package com.fugisawa.j2k.livecoding.kotlin

data class Circle(val center: Point, val radius: Int = 1)


operator fun Circle.contains(point: Point) =
    center distanceTo point <= radius

infix fun Circle.inscribed(points: Collection<Point>) =
    points.filter { it in this }.toSet()

infix fun Circle.numberOfInscribed(points: Collection<Point>) =
    inscribed(points).size

infix fun Circle.aRandomInscribedFrom(points: Collection<Point>) =
    inscribed(points).randomOrNull()



infix fun Point.radius(radius: Int) = Circle(this, radius)