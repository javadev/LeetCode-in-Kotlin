package g1201_1300.s1202_smallest_string_with_swaps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestStringWithSwaps() {
        assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "dcab",
                    listOf(listOf(0, 3), listOf(1, 2)),
                ),
            equalTo("bacd"),
        )
    }

    @Test
    fun smallestStringWithSwaps2() {
        assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "dcab",
                    listOf(
                        listOf(0, 3),
                        listOf(1, 2),
                        listOf(0, 2),
                    ),
                ),
            equalTo("abcd"),
        )
    }

    @Test
    fun smallestStringWithSwaps3() {
        assertThat(
            Solution()
                .smallestStringWithSwaps(
                    "cba",
                    listOf(listOf(0, 1), listOf(1, 2)),
                ),
            equalTo("abc"),
        )
    }
}
