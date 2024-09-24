package g3201_3300.s3295_report_spam_message

// #Medium #Array #String #Hash_Table #2024_09_24_Time_782_ms_(74.19%)_Space_109.6_MB_(38.71%)

class Solution {
    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
        val bannedUnique: MutableSet<String?> = mutableSetOf(*bannedWords)
        var bannedCount = 0
        for (msg in message) {
            if (bannedUnique.contains(msg)) {
                bannedCount++
            }
            if (bannedCount == 2) {
                return true
            }
        }
        return false
    }
}
