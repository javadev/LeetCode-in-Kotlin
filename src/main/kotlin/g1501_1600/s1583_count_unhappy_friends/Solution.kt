package g1501_1600.s1583_count_unhappy_friends

// #Medium #Array #Simulation #2023_06_14_Time_324_ms_(100.00%)_Space_60.5_MB_(100.00%)

class Solution {
    fun unhappyFriends(n: Int, preferences: Array<IntArray>, pairs: Array<IntArray>): Int {
        var unhappyFriends = 0
        val assignedPair: MutableMap<Int, Int> = HashMap()
        for (pair in pairs) {
            assignedPair[pair[0]] = pair[1]
            assignedPair[pair[1]] = pair[0]
        }
        for (pair in pairs) {
            if (isUnHappy(pair[1], pair[0], preferences, assignedPair)) {
                unhappyFriends++
            }
            if (isUnHappy(pair[0], pair[1], preferences, assignedPair)) {
                unhappyFriends++
            }
        }
        return unhappyFriends
    }

    private fun isUnHappy(
        self: Int,
        assignedFriend: Int,
        preferences: Array<IntArray>,
        assignedPairs: Map<Int, Int>
    ): Boolean {
        val preference = preferences[self]
        val assignedFriendPreferenceIndex = findIndex(preference, assignedFriend)
        for (i in 0..assignedFriendPreferenceIndex) {
            val preferredFriend = preference[i]
            val preferredFriendAssignedFriend = assignedPairs[preferredFriend]!!
            if (preferredFriendAssignedFriend == self) {
                return false
            }
            val candidateAssignedFriendIndex = findIndex(preferences[preferredFriend], preferredFriendAssignedFriend)
            if (isPreferred(self, preferences[preferredFriend], candidateAssignedFriendIndex)) {
                return true
            }
        }
        return false
    }

    private fun isPreferred(self: Int, preference: IntArray, boundary: Int): Boolean {
        for (i in 0..boundary) {
            if (self == preference[i]) {
                return true
            }
        }
        return false
    }

    private fun findIndex(preference: IntArray, assignedFriend: Int): Int {
        for (i in preference.indices) {
            if (preference[i] == assignedFriend) {
                return i
            }
        }
        return 0
    }
}
