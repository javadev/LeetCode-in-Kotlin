package g1701_1800.s1733_minimum_number_of_people_to_teach

// #Medium #Array #Greedy #2023_06_16_Time_580_ms_(100.00%)_Space_57.1_MB_(100.00%)

class Solution {
    fun minimumTeachings(n: Int, languages: Array<IntArray>, friendships: Array<IntArray>): Int {
        val m: Int = languages.size
        val speak: Array<BooleanArray> = Array(m + 1) { BooleanArray(n + 1) }
        val teach: Array<BooleanArray> = Array(m + 1) { BooleanArray(n + 1) }
        for (user in 0 until m) {
            val userLanguages: IntArray = languages.get(user)
            for (userLanguage: Int in userLanguages) {
                speak.get(user + 1)[userLanguage] = true
            }
        }
        val listToTeach: MutableList<IntArray> = ArrayList()
        for (friend: IntArray in friendships) {
            val userA: Int = friend[0]
            val userB: Int = friend[1]
            var hasCommonLanguage = false
            for (language in 1..n) {
                if (speak.get(userA).get(language) && speak.get(userB).get(language)) {
                    hasCommonLanguage = true
                    break
                }
            }
            if (!hasCommonLanguage) {
                for (language in 1..n) {
                    if (!speak[userA][language]) {
                        teach[userA][language] = true
                    }
                    if (!speak[userB][language]) {
                        teach[userB][language] = true
                    }
                }
                listToTeach.add(friend)
            }
        }
        var minLanguage: Int = Int.MAX_VALUE
        var languageToTeach = 0
        for (language in 1..n) {
            var count = 0
            for (user in 1..m) {
                if (teach[user][language]) {
                    count++
                }
            }
            if (count < minLanguage) {
                minLanguage = count
                languageToTeach = language
            }
        }
        val setToTeach: MutableSet<Int> = HashSet()
        for (friend: IntArray in listToTeach) {
            val userA: Int = friend[0]
            val userB: Int = friend[1]
            if (!speak[userA][languageToTeach]) {
                setToTeach.add(userA)
            }
            if (!speak[userB][languageToTeach]) {
                setToTeach.add(userB)
            }
        }
        return setToTeach.size
    }
}
