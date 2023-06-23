package g2101_2200.s2126_destroying_asteroids

// #Medium #Array #Sorting #Greedy
@Suppress("NAME_SHADOWING")
class Solution {
    fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
        return helper(mass.toLong(), 0, asteroids)
    }

    private fun helper(mass: Long, startIndex: Int, asteroids: IntArray): Boolean {
        var mass = mass
        var smallOrEqualIndex = partition(mass, startIndex, asteroids)
        if (smallOrEqualIndex < startIndex) {
            return false
        }
        if (smallOrEqualIndex >= asteroids.size - 1) {
            return true
        }
        for (i in startIndex..smallOrEqualIndex) {
            mass += asteroids[i].toLong()
        }
        return helper(mass, ++smallOrEqualIndex, asteroids)
    }

    private fun partition(mass: Long, startIndex: Int, asteroids: IntArray): Int {
        val length = asteroids.size
        var smallOrEqualIndex = startIndex - 1
        for (i in startIndex until length) {
            if (asteroids[i] <= mass) {
                smallOrEqualIndex++
                swap(asteroids, i, smallOrEqualIndex)
            }
        }
        return smallOrEqualIndex
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
    }
}
