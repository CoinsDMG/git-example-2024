package one

class Bike : Vehicle() {
    //override val speed = "180 км/ч"
    //override val color = "Черный"
    override val countOfWheels = "2"

    override fun displayinfo() {
        println("Количество колёс у мотоцикла: $countOfWheels")
        super.displayinfo() // инфа из Vehicle
    }
}