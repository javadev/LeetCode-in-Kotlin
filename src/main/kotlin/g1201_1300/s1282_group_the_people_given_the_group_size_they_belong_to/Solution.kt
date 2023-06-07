package g1201_1300.s1282_group_the_people_given_the_group_size_they_belong_to

// #Medium #Array #Hash_Table
class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val map: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in groupSizes.indices) {
            val list = map.getOrDefault(groupSizes[i], ArrayList())
            list.add(i)
            map[groupSizes[i]] = list
        }
        val result: MutableList<List<Int>> = ArrayList()
        for ((key, list) in map) {
            var i = 0
            do {
                result.add(list.subList(i, i + key))
                i += key
            } while (i + key <= list.size)
        }
        return result
    }
}
