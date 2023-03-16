package g0801_0900.s0802_find_eventual_safe_states

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun eventualSafeNodes() {
        assertThat(
            Solution()
                .eventualSafeNodes(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(5),
                        intArrayOf(0),
                        intArrayOf(5),
                        intArrayOf(),
                        intArrayOf()
                    )
                ),
            equalTo(listOf(2, 4, 5, 6))
        )
    }

    @Test
    fun eventualSafeNodes2() {
        assertThat(
            Solution()
                .eventualSafeNodes(
                    arrayOf(
                        intArrayOf(1, 2, 3, 4),
                        intArrayOf(1, 2),
                        intArrayOf(3, 4),
                        intArrayOf(0, 4),
                        intArrayOf()
                    )
                ),
            equalTo(listOf(4))
        )
    }
}
