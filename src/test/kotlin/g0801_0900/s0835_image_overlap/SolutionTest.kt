package g0801_0900.s0835_image_overlap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestOverlap() {
        assertThat(
            Solution()
                .largestOverlap(
                    arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 0), intArrayOf(0, 1, 0)),
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1), intArrayOf(0, 0, 1)),
                ),
            equalTo(3),
        )
    }

    @Test
    fun largestOverlap2() {
        assertThat(Solution().largestOverlap(arrayOf(intArrayOf(1)), arrayOf(intArrayOf(1))), equalTo(1))
    }

    @Test
    fun largestOverlap3() {
        assertThat(Solution().largestOverlap(arrayOf(intArrayOf(0)), arrayOf(intArrayOf(0))), equalTo(0))
    }
}
