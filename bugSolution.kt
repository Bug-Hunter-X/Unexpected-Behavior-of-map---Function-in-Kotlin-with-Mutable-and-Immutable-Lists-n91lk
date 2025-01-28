fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]
    println(list) // Output: [1, 2, 3, 4, 5]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val resultList = mutableList.map { it * 2 }
    println(resultList) // Output: [2, 4, 6, 8, 10]
    println(mutableList) // Output: [1, 2, 3, 4, 5]

    //To modify the mutable list in place, use mapIndexedTo 
    mutableList.mapIndexedTo(mutableList){index, value -> value *2}
    println(mutableList) // Output: [2,4,6,8,10]
} 