package one

open class Vehicle {
    open val speed = ""
    open val color = ""
    open fun displayinfo() {
        println("Скорость: $speed n/ Цвет: $color")
    }
}