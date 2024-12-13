fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeAll { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}
    //Alternative solution for map
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map2) {
        if (value % 2 == 0) {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach { map2.remove(it) }
    println(map2) // Output: {a=1, c=3}
}