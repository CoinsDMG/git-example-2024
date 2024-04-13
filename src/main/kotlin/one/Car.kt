package one

open class Car : Vehicle() {
    open val countOfWheels = ""
    override fun displayinfo() {
        println("Скорость: $speed n/ Цвет: $color")
    }
}