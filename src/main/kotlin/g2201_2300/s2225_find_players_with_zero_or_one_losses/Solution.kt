package g2201_2300.s2225_find_players_with_zero_or_one_losses

// #Medium #Array #Hash_Table #Sorting #Counting
class Solution {
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val map: MutableMap<Int, Int> = HashMap()
        val list1: MutableList<Int> = ArrayList()
        val list2: MutableList<Int> = ArrayList()
        val res: MutableList<List<Int>> = ArrayList()
        for (match in matches) {
            val winner = match[0]
            val loser = match[1]
            map.putIfAbsent(winner, 0)
            map[loser] = map.getOrDefault(loser, 0) + 1
        }
        for ((key, value) in map) {
            if (value == 0) {
                list1.add(key)
            }
            if (value == 1) {
                list2.add(key)
            }
        }
        list1.sort()
        list2.sort()
        res.add(list1)
        res.add(list2)
        return res
    }
}
