package g0401_0500.s0412_fizz_buzz

// #Easy #String #Math #Simulation #Udemy_Integers
// #2022_12_03_Time_307_ms_(71.81%)_Space_41.9_MB_(71.97%)

class Solution {
    fun fizzBuzz(n: Int): Array<String> = Array<String>(n) { index ->
        val value = index + 1
        when {
            (value % 3 == 0 && value % 5 == 0) -> "FizzBuzz"
            (value % 3 == 0) -> "Fizz"
            (value % 5 == 0) -> "Buzz"
            else -> "$value"
        }
    }
}
