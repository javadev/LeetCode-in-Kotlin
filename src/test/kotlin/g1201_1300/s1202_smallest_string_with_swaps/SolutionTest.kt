package g1201_1300.s1202_smallest_string_with_swaps

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestStringWithSwaps() {
        MatcherAssert.assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "dcab", listOf(listOf(0, 3), listOf(1, 2))
                ),
            CoreMatchers.equalTo("bacd")
        )
    }

    @Test
    fun smallestStringWithSwaps2() {
        MatcherAssert.assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "dcab",
                    listOf(
                        listOf(0, 3),
                        listOf(1, 2),
                        listOf(0, 2)
                    )
                ),
            CoreMatchers.equalTo("abcd")
        )
    }

    @Test
    fun smallestStringWithSwaps3() {
        MatcherAssert.assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "cba", listOf(listOf(0, 1), listOf(1, 2))
                ),
            CoreMatchers.equalTo("abc")
        )
    }
}
