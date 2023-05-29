package g1101_1200.s1105_filling_bookcase_shelves

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minHeightShelves() {
        MatcherAssert.assertThat(
            Solution()
                .minHeightShelves(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 3),
                        intArrayOf(2, 3),
                        intArrayOf(1, 1),
                        intArrayOf(1, 1),
                        intArrayOf(1, 1),
                        intArrayOf(1, 2)
                    ),
                    4
                ),
            CoreMatchers.equalTo(6)
        )
    }

    @Test
    fun minHeightShelves2() {
        MatcherAssert.assertThat(
            Solution().minHeightShelves(arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 2)), 66),
            CoreMatchers.equalTo(4)
        )
    }
}