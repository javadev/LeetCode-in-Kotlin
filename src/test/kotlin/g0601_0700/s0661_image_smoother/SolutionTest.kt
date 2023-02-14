package g0601_0700.s0661_image_smoother

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun imageSmoother() {
        assertThat(
            Solution().imageSmoother(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))),
            equalTo(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)))
        )
    }

    @Test
    fun imageSmoother2() {
        assertThat(
            Solution()
                .imageSmoother(arrayOf(intArrayOf(100, 200, 100), intArrayOf(200, 50, 200), intArrayOf(100, 200, 100))),
            equalTo(arrayOf(intArrayOf(137, 141, 137), intArrayOf(141, 138, 141), intArrayOf(137, 141, 137)))
        )
    }
}
