package one

open class Vehicle {
    open val speed = ""
    open val color = ""
    open val countOfWheels = ""
    open fun displayinfo() {
        println("Скорость: $speed n/ Цвет: $color n/ Количество колёс: $countOfWheels")
    }
}