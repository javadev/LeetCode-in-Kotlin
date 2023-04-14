package g0901_1000.s0904_fruit_into_baskets

// #Medium #Array #Hash_Table #Sliding_Window #2023_04_14_Time_371_ms_(100.00%)_Space_46_MB_(87.50%)

class Solution {
    fun totalFruit(fruits: IntArray): Int {
        var end = 1
        var basket1 = fruits[0]
        var basket2 = -1
        var secondFruitIndex = -1
        var maxTotal = 1
        var counter = 1
        while (end < fruits.size) {
            if (fruits[end - 1] != fruits[end]) {
                if (basket2 == -1) {
                    basket2 = fruits[end]
                    secondFruitIndex = end
                    counter++
                } else if (fruits[end] == basket1) {
                    basket1 = basket2
                    basket2 = fruits[end]
                    secondFruitIndex = end
                    counter++
                } else {
                    counter = end - secondFruitIndex + 1
                    basket1 = basket2
                    basket2 = fruits[end]
                    secondFruitIndex = end
                }
            } else {
                counter++
            }
            end++
            maxTotal = maxTotal.coerceAtLeast(counter)
        }
        return maxTotal
    }
}
