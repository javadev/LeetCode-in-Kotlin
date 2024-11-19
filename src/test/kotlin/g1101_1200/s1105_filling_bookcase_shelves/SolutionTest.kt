package g1101_1200.s1105_filling_bookcase_shelves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minHeightShelves() {
        assertThat(
            Solution()
                .minHeightShelves(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 3),
                        intArrayOf(2, 3),
                        intArrayOf(1, 1),
                        intArrayOf(1, 1),
                        intArrayOf(1, 1),
                        intArrayOf(1, 2),
                    ),
                    4,
                ),
            equalTo(6),
        )
    }

    @Test
    fun minHeightShelves2() {
        assertThat(
            Solution().minHeightShelves(arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 2)), 66),
            equalTo(4),
        )
    }
}
