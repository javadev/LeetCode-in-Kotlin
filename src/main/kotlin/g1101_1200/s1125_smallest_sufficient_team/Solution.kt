package g1101_1200.s1125_smallest_sufficient_team

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
class Solution {
    private var ans: List<Int> = ArrayList()
    fun smallestSufficientTeam(skills: Array<String>, people: List<List<String>>): IntArray {
        val n = skills.size
        val m = people.size
        val map: MutableMap<String, Int> = HashMap()
        for (i in 0 until n) {
            map[skills[i]] = i
        }
        val arr = IntArray(m)
        for (i in 0 until m) {
            val list = people[i]
            var `val` = 0
            for (skill in list) {
                `val` = `val` or (1 shl map[skill]!!)
            }
            arr[i] = `val`
        }
        val banned = BooleanArray(m)
        for (i in 0 until m) {
            for (j in i + 1 until m) {
                val `val` = arr[i] or arr[j]
                if (`val` == arr[i]) {
                    banned[j] = true
                } else if (`val` == arr[j]) {
                    banned[i] = true
                }
            }
        }
        helper(0, n, arr, mutableListOf(), banned)
        val res = IntArray(ans.size)
        for (i in res.indices) {
            res[i] = ans[i]
        }
        return res
    }

    private fun helper(cur: Int, n: Int, arr: IntArray, list: MutableList<Int>, banned: BooleanArray) {
        if (cur == (1 shl n) - 1) {
            if (ans.isEmpty() || ans.size > list.size) {
                ans = ArrayList(list)
            }
            return
        }
        if (!ans.isEmpty() && list.size >= ans.size) {
            return
        }
        var zero = 0
        while (cur shr zero and 1 == 1) {
            zero++
        }
        for (i in arr.indices) {
            if (banned[i]) {
                continue
            }
            if (arr[i] shr zero and 1 == 1) {
                list.add(i)
                helper(cur or arr[i], n, arr, list, banned)
                list.removeAt(list.size - 1)
            }
        }
    }
}
