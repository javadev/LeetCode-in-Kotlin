package g0701_0800.s0706_design_hashmap

// #Easy #Array #Hash_Table #Design #Linked_List #Hash_Function #Data_Structure_II_Day_2_Array
// #2023_02_24_Time_405_ms_(92.11%)_Space_58.1_MB_(93.42%)

@Suppress("NAME_SHADOWING")
class MyHashMap {
    private var arr: Array<MutableList<Entry>?>? = null

    init {
        arr = arrayOfNulls<MutableList<Entry>?>(1000)
    }

    fun put(key: Int, value: Int) {
        val bucket = key % 1000
        if (arr!![bucket] == null) {
            val list = ArrayList<Entry>()
            val e = Entry()
            e.key = key
            e.value = value
            list.add(e)
            arr!![bucket] = list
        } else {
            val list: MutableList<Entry>? = arr!![bucket]
            val e = Entry()
            e.key = key
            e.value = value
            list!!.remove(e)
            list.add(e)
        }
    }

    fun get(key: Int): Int {
        val bucket = key % 1000
        var ans = -1
        val list: ArrayList<Entry>? = arr!![bucket] as ArrayList<Entry>?
        if (list != null) {
            for (e in list) {
                if (e.key == key) {
                    ans = e.value
                }
            }
        }
        return ans
    }

    fun remove(key: Int) {
        val bucket = key % 1000
        val list: ArrayList<Entry>? = arr!![bucket] as ArrayList<Entry>?
        val e = Entry()
        e.key = key
        list?.remove(e)
    }

    internal class Entry {
        var key = 0
        var value = 0
        override fun hashCode(): Int {
            val prime = 31
            var result = 1
            result = prime * result + key
            return result
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }
            if (other == null) {
                return false
            }
            if (javaClass != other.javaClass) {
                return false
            }
            val other = other as Entry
            return key == other.key
        }
    }
}

/*
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
