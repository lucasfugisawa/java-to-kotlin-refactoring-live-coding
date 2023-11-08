package com.fugisawa.j2k.livecoding.kotlin

import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x: Int, val y: Int)

infix fun Point.distanceTo(point: Point) =
    sqrt((point.x - x).toDouble().pow(2.0) + (point.y - y).toDouble().pow(2.0))

infix fun Int.x(y: Int) = Point(this, y)