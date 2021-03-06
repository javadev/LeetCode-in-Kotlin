package s0010.regular.expression.matching

class Solution {
    fun isMatch(text:String, pattern:String): Boolean {
    val dp = Array<BooleanArray>(text.length + 1, {BooleanArray(pattern.length + 1)})
    dp[text.length][pattern.length] = true
    for (i in text.length downTo 0)
    {
      for (j in pattern.length - 1 downTo 0)
      {
        val first_match = ((i < text.length && ((pattern.get(j) == text.get(i) || pattern.get(j) == '.'))))
        if (j + 1 < pattern.length && pattern.get(j + 1) == '*')
        {
          dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j]
        }
        else
        {
          dp[i][j] = first_match && dp[i + 1][j + 1]
        }
      }
    }
    return dp[0][0]

    }
}
