package one

open class Bike : Vehicle() {
    open val countOfWheels = ""

    override fun displayinfo() {
        println("Скорость: $speed n/ Цвет: $color")
    }
}