package one

class Bike : Vehicle() {
    override val speed = "40 км/ч"
    override val color = "Черный"
    override val countOfWheels = "2"
    override val name = "Forward"

    override fun displayinfo() {
        //println("Количество колёс у велосипеда: $countOfWheels")
        super.displayinfo() // инфа из Vehicle
    }
    override fun makeSound() {
        println("Тцзынь тцзынь!!! (Велосипед издает звонок.)")
    }
}