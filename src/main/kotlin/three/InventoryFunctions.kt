package three

fun printInventory(products: List<Product>) { //Вывод информации о каждом товаре в магазине
    products.forEach { product ->
        println("Название: ${product.name}, Категория: ${product.category}, Цена: ${product.price}, Количество: ${product.quantity}")
    }
}

fun totalInventoryValue(products: List<Product>): Double { //Вычисляет общую стоимость всех товаров на складе
    return products.sumOf { it.price * it.quantity }
}

fun productsByCategory(products: List<Product>, category: String): List<Product> { //Возвращает список товаров определенной категории
    return products.filter { it.category == category }
}

fun addProduct(products: MutableList<Product>, product: Product) { //Добавление нового товара
    products.add(product)
}

fun updateProduct(products: MutableList<Product>, name: String, newProduct: Product) { //Обновление информации о товаре в списке на основе его имени
    val index = products.indexOfFirst { it.name == name }
    if (index != -1) {
        products[index] = newProduct
    }
}

fun lowestPricedProductByCategory(products: List<Product>): Map<String, Product> { //Поиск товара с самой низкой стоимостью в каждой категории
    return products.groupBy { it.category }
        .mapValues { (_, productsInCategory) ->
            productsInCategory.minByOrNull { it.price }!!
        }
}

fun uniqueCategories(products: List<Product>): Set<String> { //Вывод всеъ категорий без дублирования
    return products.map { it.category }.toSet()
}