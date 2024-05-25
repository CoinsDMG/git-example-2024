package MyPlaylist

class Playlist(val name: String, val genre: String, val songs: Array<String>) {

    fun getPlaylistDetails() {
        println("Название плейлиста: $name")
        println("Жанр: $genre")
        println("Список песен:")
        songs.forEach { song ->
            println("- $song")
        }
    }
}

fun main() {
    // Пример создания плейлиста с песнями русского рока
    val playlist = Playlist(
        name = "Мои любимые песни",
        genre = "Русский Рок",
        songs = arrayOf(
            "Солнце встаёт - Алиса",
            "Дождь для нас - Кино",
            "Polly - Nirvana",
            "Русское поле экспериментов - Гражданская оборона",
            "Сидя на красивом холме - Аквариум",
            "Ночь - Кино",
            "На краю - Король и Шут",
            "Уходи - Кино",
            "Наваждение - Гражданская Оборона",
            "Кто ещё... - Наутилус Помпилиус"

        )
    )

    // Вывод деталей плейлиста
    playlist.getPlaylistDetails()
}