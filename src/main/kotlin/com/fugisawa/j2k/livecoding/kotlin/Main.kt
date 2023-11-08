package com.fugisawa.j2k.livecoding.kotlin

fun main() {
    val points = setOf(
        1 x 1,
        2 x 2,
        3 x 3,
        4 x 4,
        5 x 5,
    )
    val circle = 2 x 2 radius 1

    val count = circle numberOfInscribed points
    val inscribedPoints = circle inscribed points
    val aRandomInscribedPoint = circle aRandomInscribedFrom points

    println("Inscribed points: $inscribedPoints")
    println("Number of inscribed points: $count")

    aRandomInscribedPoint
        ?.let {
            println("A random inscribed point: $it")
            doSomethingWithPoint(it)
        }
        ?: throw IllegalStateException("aRandomInscribedPoint is null")

} 

fun doSomethingWithPoint(point: Point) {
    println("X is " + point.x)
    println("Y is " + point.y)
}
