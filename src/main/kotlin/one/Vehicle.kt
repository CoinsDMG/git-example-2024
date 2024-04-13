package one

abstract class Vehicle {
    open val speed = ""
    open val color = ""
    open val countOfWheels = ""

    abstract fun makeSound()

    open fun displayinfo() {
        println("Скорость: $speed n/ Цвет: $color n/ Количество колёс: $countOfWheels")
    }

}