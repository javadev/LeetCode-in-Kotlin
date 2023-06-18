package g1701_1800.s1773_count_items_matching_a_rule

// #Easy #Array #String #2023_06_18_Time_227_ms_(97.50%)_Space_45.3_MB_(72.50%)

class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var ans = 0
        var checkRuleNum = 0
        if (ruleKey == "color") {
            checkRuleNum = 1
        } else if (ruleKey == "name") {
            checkRuleNum = 2
        }
        for (item in items) {
            if (item[checkRuleNum] == ruleValue) {
                ans++
            }
        }
        return ans
    }
}
