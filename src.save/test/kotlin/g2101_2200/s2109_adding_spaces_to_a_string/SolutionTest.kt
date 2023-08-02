package g2101_2200.s2109_adding_spaces_to_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addSpaces() {
        assertThat(
            Solution().addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15)),
            equalTo("Leetcode Helps Me Learn")
        )
    }

    @Test
    fun addSpaces2() {
        assertThat(
            Solution().addSpaces("icodeinpython", intArrayOf(1, 5, 7, 9)),
            equalTo("i code in py thon")
        )
    }

    @Test
    fun addSpaces3() {
        assertThat(
            Solution().addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6)),
            equalTo(" s p a c i n g")
        )
    }
}
