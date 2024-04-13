package one

class ElectricCar : Car(), FuelEfficient {
    val batteryCapacity = ""
    override fun fuelEfficiency() {
        println("Зарядка от электричества")
    }
}