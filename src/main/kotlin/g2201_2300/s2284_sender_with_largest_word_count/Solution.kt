package g2201_2300.s2284_sender_with_largest_word_count

// #Medium #Array #String #Hash_Table #Counting
// #2023_06_28_Time_672_ms_(100.00%)_Space_52.9_MB_(100.00%)

class Solution {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val x = HashMap<String, Int>()
        for (i in messages.indices) {
            val words = messages[i].length - messages[i].replace(" ", "").length + 1
            if (x.containsKey(senders[i])) {
                x[senders[i]] = x[senders[i]]!! + words
            } else {
                x[senders[i]] = words
            }
        }
        var result = ""
        var max = 0
        for ((key, value) in x) {
            if (value > max ||
                value == max && result.compareTo(key) < 0
            ) {
                max = value
                result = key
            }
        }
        return result
    }
}
