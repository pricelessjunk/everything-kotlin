package chapter10

var reflectionproperty = 0

fun main() {
    val kProperty = ::reflectionproperty
    kProperty.setter.call(21)
    println(kProperty.get())
}
