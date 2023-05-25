package g1101_1200.s1177_can_make_palindrome_from_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakePaliQueries() {
        assertThat(
            Solution()
                .canMakePaliQueries(
                    "abcda",
                    arrayOf(
                        intArrayOf(3, 3, 0),
                        intArrayOf(1, 2, 0),
                        intArrayOf(0, 3, 1),
                        intArrayOf(0, 3, 2),
                        intArrayOf(0, 4, 1)
                    )
                ),
            equalTo(mutableListOf(true, false, false, true, true))
        )
    }

    @Test
    fun canMakePaliQueries2() {
        assertThat(
            Solution().canMakePaliQueries("lyb  ", arrayOf(intArrayOf(0, 1, 0), intArrayOf(2, 2, 1))),
            equalTo(mutableListOf(false, true))
        )
    }
}
