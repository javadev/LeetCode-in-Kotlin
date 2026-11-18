package g3901_4000.s3995_minimum_cost_to_convert_string_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution()
                .minCost(
                    "hello",
                    "world",
                    mutableListOf<MutableList<String>>(
                        mutableListOf<String>("he", "wo"),
                        mutableListOf<String>("llo", "rld"),
                    ),
                    intArrayOf(3, 4),
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(
                "cat",
                "dog",
                mutableListOf<MutableList<String>>(mutableListOf<String>("c*t", "dog")),
                intArrayOf(2),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Int>(
            Solution()
                .minCost(
                    "test",
                    "next",
                    mutableListOf<MutableList<String>>(mutableListOf<String>("*e*t", "next")),
                    intArrayOf(4),
                ),
            equalTo<Int>(6),
        )
    }

    @Test
    fun minCost4() {
        assertThat<Int>(
            Solution().minCost(
                "ab",
                "bc",
                mutableListOf<MutableList<String>>(mutableListOf<String>("a*", "bd")),
                intArrayOf(9),
            ),
            equalTo<Int>(-1),
        )
    }
}
