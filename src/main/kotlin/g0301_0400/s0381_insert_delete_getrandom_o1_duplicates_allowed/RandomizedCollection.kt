package g0301_0400.s0381_insert_delete_getrandom_o1_duplicates_allowed

// #Hard #Array #Hash_Table #Math #Design #Randomized
// #2022_11_24_Time_1313_ms_(50.00%)_Space_148_MB_(25.00%)

class RandomizedCollection() {
    val m2a = HashMap<Int, HashSet<Int>>()
    val a2m = ArrayList<Int>()
    /** Initialize your data structure here. */

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    fun insert(x: Int): Boolean {
        a2m.add(x)
        val pos = a2m.size - 1
        if (x in m2a) {
            m2a[x]!!.add(pos)
            return false
        } else {
            m2a[x] = HashSet<Int>()
            m2a[x]!!.add(pos)
            return true
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    fun remove(x: Int): Boolean {
        if (x !in m2a)
            return false
        val pos = m2a[x]!!.iterator().next()
        if (m2a[x]!!.size == 1)
            m2a.remove(x)
        else
            m2a[x]!!.remove(pos)
        if (pos != a2m.size - 1) {
            m2a[a2m[a2m.size - 1]]!!.remove(a2m.size - 1)
            m2a[a2m[a2m.size - 1]]!!.add(pos)
            a2m[pos] = a2m[a2m.size - 1]
        }
        a2m.removeAt(a2m.size - 1)
        return true
    }

    /** Get a random element from the collection. */
    fun getRandom(): Int {
        val pos = Math.floor(Math.random() * a2m.size).toInt()
        return a2m[pos]
    }
}

/*
 * Your RandomizedCollection object will be instantiated and called as such:
 * var obj = RandomizedCollection()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */
