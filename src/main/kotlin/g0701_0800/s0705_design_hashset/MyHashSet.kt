package g0701_0800.s0705_design_hashset

// #Easy #Array #Hash_Table #Design #Linked_List #Hash_Function
// #2023_02_23_Time_385_ms_(75.61%)_Space_111.9_MB_(7.32%)

class MyHashSet {
    private val arr: BooleanArray = BooleanArray(1000001)

    fun add(key: Int) {
        arr[key] = true
    }

    fun remove(key: Int) {
        arr[key] = false
    }

    operator fun contains(key: Int): Boolean {
        return arr[key]
    }
}


/*
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */