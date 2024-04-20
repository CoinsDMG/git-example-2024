package one

open class ElectricCar : Car(), FuelEfficient {
    open val batteryCapacity = "100 кВтч"
    override val name = "Tesla"
    override val speed = "280 км/ч"
    override val color = "Белый"
    override fun fuelEfficiency() {
        println("Топливо: Зарядка от электричества, Ёмкость батареи: $batteryCapacity")
    }
}