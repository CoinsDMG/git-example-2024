package one

class Car : Vehicle() {
    //override val speed = "220 км/ч"
    //override val color = "Красный"
    override val countOfWheels = "4"
    override fun displayinfo() {
        println("Количество колёс у автомобиля: $countOfWheels")
        super.displayinfo()
    }
}