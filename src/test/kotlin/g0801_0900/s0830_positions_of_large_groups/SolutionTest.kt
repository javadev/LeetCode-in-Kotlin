package g0801_0900.s0830_positions_of_large_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largeGroupPositions() {
        assertThat(
            Solution().largeGroupPositions("abbxxxxzzy"),
            equalTo(listOf(listOf(3, 6))),
        )
    }

    @Test
    fun largeGroupPositions2() {
        assertThat(Solution().largeGroupPositions("abc"), equalTo(emptyList()))
    }

    @Test
    fun largeGroupPositions3() {
        assertThat(
            Solution().largeGroupPositions("abcdddeeeeaabbbcd"),
            equalTo(
                listOf(
                    listOf(3, 5),
                    listOf(6, 9),
                    listOf(12, 14),
                ),
            ),
        )
    }
}
