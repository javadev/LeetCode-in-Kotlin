package g0301_0400.s0380_insert_delete_getrandom_o1

// #Medium #Top_Interview_Questions #Array #Hash_Table #Math #Design #Randomized
// #Programming_Skills_II_Day_20 #2022_11_22_Time_1326_ms_(68.23%)_Space_119.7_MB_(83.53%)

import java.util.Random

class RandomizedSet {
    private val rand: Random
    private val list: MutableList<Int>
    private val map: MutableMap<Int, Int>

    /* Initialize your data structure here. */
    init {
        rand = Random()
        list = ArrayList()
        map = HashMap()
    }

    /* Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    fun insert(`val`: Int): Boolean {
        if (map.containsKey(`val`)) {
            return false
        }
        map[`val`] = list.size
        list.add(`val`)
        return true
    }

    /* Removes a value from the set. Returns true if the set contained the specified element. */
    fun remove(`val`: Int): Boolean {
        if (!map.containsKey(`val`)) {
            return false
        }
        val swap1 = map[`val`]!!
        val swap2 = list.size - 1
        val val2 = list[swap2]
        map[val2] = swap1
        map.remove(`val`)
        list[swap1] = val2
        list.removeAt(list.size - 1)
        return true
    }

    /* Get a random element from the set. */
    fun getRandom(): Int {
        return list[rand.nextInt(list.size)]
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */
