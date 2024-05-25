package three
fun main() {
    val products = mutableListOf(
        Product("Ноутбук", "Электроника", 94990.99, 102),
        Product("Смартфон", "Электроника", 34990.99, 309),
        Product("Офисное кресло", "Мебель", 15149.99, 150),
        Product("Диван", "Мебель", 39899.99, 50),
        Product("Кофеварка", "Бытовая техника", 22890.99, 250),
        Product("Микроволновка", "Бытовая техника", 7490.99, 120)
    )

    println("Инвентарь:")
    printInventory(products)

    val totalValue = totalInventoryValue(products)
    println("\nОбщая стоимость инвентаря: $totalValue")

    val electronics = productsByCategory(products, "Электроника")
    println("\nКатегория Электроника:")
    printInventory(electronics)

//    РЕАЛИЗАЦИЯ ДОБАВЛЕНИЯ НОВОГО ТОВАРА
    val newProduct = Product("Клавиатура", "Электроника", 10990.99, 30)
    addProduct(products, newProduct)
    println("\nИнвентарь после добавления нового товара:")
    printInventory(products)

//    РЕАЛИЗАЦИЯ ОБНОВЛЕНИЯ ПРОДУКТА ИЗ ИНВЕНТАРЯ
    val updatedProduct = Product("Смартфон", "Электроника", 34990.99, 308)
    updateProduct(products, "Смартфон", updatedProduct)
    println("\nИнвентарь после обновления товара:")
    printInventory(products)

    val lowestPricedProducts = lowestPricedProductByCategory(products)
    println("\nСамые дешевые товары по категориям:")
    lowestPricedProducts.forEach { (category, product) ->
        println("Категория: $category, Товар: ${product.name}, Цена: ${product.price}")
    }

    val categories = uniqueCategories(products)
    println("\nВсе категории:")
    categories.forEach { category ->
        println(category)
    }
}