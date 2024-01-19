package g2901_3000.s2977_minimum_cost_to_convert_string_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution()
                .minimumCost(
                    "abcd",
                    "acbe",
                    arrayOf("a", "b", "c", "c", "e", "d"),
                    arrayOf("b", "c", "b", "e", "b", "e"),
                    intArrayOf(2, 5, 5, 1, 2, 20)
                ),
            equalTo(28L)
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution()
                .minimumCost(
                    "abcdefgh",
                    "acdeeghh",
                    arrayOf("bcd", "fgh", "thh"),
                    arrayOf("cde", "thh", "ghh"),
                    intArrayOf(1, 3, 5)
                ),
            equalTo(9L)
        )
    }

    @Test
    fun minimumCost3() {
        assertThat(
            Solution()
                .minimumCost(
                    "abcdefgh",
                    "addddddd",
                    arrayOf("bcd", "defgh"),
                    arrayOf("ddd", "ddddd"),
                    intArrayOf(100, 1578)
                ),
            equalTo(-1L)
        )
    }
}
