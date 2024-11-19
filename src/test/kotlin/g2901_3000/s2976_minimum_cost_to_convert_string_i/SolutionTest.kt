package g2901_3000.s2976_minimum_cost_to_convert_string_i

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
                    charArrayOf('a', 'b', 'c', 'c', 'e', 'd'),
                    charArrayOf('b', 'c', 'b', 'e', 'b', 'e'),
                    intArrayOf(2, 5, 5, 1, 2, 20),
                ),
            equalTo(28L),
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution()
                .minimumCost(
                    "aaaa",
                    "bbbb",
                    charArrayOf('a', 'c'),
                    charArrayOf('c', 'b'),
                    intArrayOf(1, 2),
                ),
            equalTo(12L),
        )
    }

    @Test
    fun minimumCost3() {
        assertThat(
            Solution()
                .minimumCost(
                    "abcd",
                    "abce",
                    charArrayOf('a'),
                    charArrayOf('e'),
                    intArrayOf(1000),
                ),
            equalTo(-1L),
        )
    }
}
