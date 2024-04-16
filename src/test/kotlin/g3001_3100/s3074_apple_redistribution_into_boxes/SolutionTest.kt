package g3001_3100.s3074_apple_redistribution_into_boxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumBoxes() {
        assertThat(
            Solution().minimumBoxes(intArrayOf(1, 3, 2), intArrayOf(4, 3, 1, 5, 2)),
            equalTo(2)
        )
    }

    @Test
    fun minimumBoxes2() {
        assertThat(
            Solution().minimumBoxes(intArrayOf(5, 5, 5), intArrayOf(2, 4, 2, 7)),
            equalTo(4)
        )
    }
}
