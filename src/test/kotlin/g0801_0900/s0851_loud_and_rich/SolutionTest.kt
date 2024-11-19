package g0801_0900.s0851_loud_and_rich

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun loudAndRich() {
        assertThat(
            Solution()
                .loudAndRich(
                    arrayOf(
                        intArrayOf(1, 0),
                        intArrayOf(2, 1),
                        intArrayOf(3, 1),
                        intArrayOf(3, 7),
                        intArrayOf(4, 3),
                        intArrayOf(5, 3),
                        intArrayOf(6, 3),
                    ),
                    intArrayOf(3, 2, 5, 4, 6, 1, 7, 0),
                ),
            equalTo(intArrayOf(5, 5, 2, 5, 4, 5, 6, 7)),
        )
    }

    @Test
    fun loudAndRich2() {
        assertThat(
            Solution().loudAndRich(arrayOf(), intArrayOf(0)),
            equalTo(intArrayOf(0)),
        )
    }
}
