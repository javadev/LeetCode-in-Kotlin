package s0008.string.to.integer.atoi

class Solution {
    fun myAtoi(str: String): Int {
    if (str.trim({ it <= ' ' }).isEmpty())
    return 0
    var localStr = str.trim({ it <= ' ' })
    var i = 0
    var ans = 0
    var sign = 1
    val len = localStr.length
    if (localStr.get(i) == '-' || localStr.get(i) == '+')
    sign = if (localStr.get(i++) == '+') 1 else -1
    while (i < len)
    {
      val tmp = localStr.get(i) - '0'
      if (tmp < 0 || tmp > 9)
      break
      if ((ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp)))
      return if (sign == 1) Integer.MAX_VALUE else Integer.MIN_VALUE
      else
      ans = ans * 10 + tmp
      ++i
    }
    return sign * ans
    }
}