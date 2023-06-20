package chapter2.l06

import chapter2.Rectangle
import java.util.Random


fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}