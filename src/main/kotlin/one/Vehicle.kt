package one

abstract class Vehicle {
    open val speed = ""
    open val color = ""
    open val countOfWheels = ""
    open val name = ""

    abstract fun makeSound()

    open fun displayinfo() {
        println("Название: $name, Скорость: $speed, Цвет: $color, Количество колёс: $countOfWheels")
    }

}