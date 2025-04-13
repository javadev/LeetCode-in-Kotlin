package g0001_0100.s0017_letter_combinations_of_a_phone_number

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Backtracking
// #LeetCode_75_Backtracking #Algorithm_II_Day_11_Recursion_Backtracking
// #Udemy_Backtracking/Recursion #Top_Interview_150_Backtracking #Big_O_Time_O(4^n)_Space_O(n)
// #2023_07_03_Time_155_ms_(95.24%)_Space_34.9_MB_(96.34%)

class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return ArrayList()
        val letters = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
        val ans: MutableList<String> = ArrayList()
        val sb = StringBuilder()
        findCombinations(0, digits, letters, sb, ans)
        return ans
    }

    private fun findCombinations(
        start: Int,
        nums: String,
        letters: Array<String>,
        curr: StringBuilder,
        ans: MutableList<String>,
    ) {
        if (curr.length == nums.length) {
            ans.add(curr.toString())
            return
        }
        for (i in start until nums.length) {
            val n = Character.getNumericValue(nums[i])
            for (j in 0 until letters[n].length) {
                val ch = letters[n][j]
                curr.append(ch)
                findCombinations(i + 1, nums, letters, curr, ans)
                curr.deleteCharAt(curr.length - 1)
            }
        }
    }
}
