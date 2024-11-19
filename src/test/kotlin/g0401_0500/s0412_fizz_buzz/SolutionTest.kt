package g0401_0500.s0412_fizz_buzz

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fizzBuzz() {
        assertThat(Solution().fizzBuzz(3), equalTo(arrayOf("1", "2", "Fizz")))
    }

    @Test
    fun fizzBuzz2() {
        assertThat(
            Solution().fizzBuzz(5),
            equalTo(arrayOf("1", "2", "Fizz", "4", "Buzz")),
        )
    }

    @Test
    fun fizzBuzz3() {
        assertThat(
            Solution().fizzBuzz(15),
            equalTo(
                arrayOf(
                    "1",
                    "2",
                    "Fizz",
                    "4",
                    "Buzz",
                    "Fizz",
                    "7",
                    "8",
                    "Fizz",
                    "Buzz",
                    "11",
                    "Fizz",
                    "13",
                    "14",
                    "FizzBuzz",
                ),
            ),
        )
    }
}
