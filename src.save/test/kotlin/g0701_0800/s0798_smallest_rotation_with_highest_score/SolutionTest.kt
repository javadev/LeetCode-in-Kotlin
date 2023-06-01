package g0701_0800.s0798_smallest_rotation_with_highest_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestRotation() {
        assertThat(Solution().bestRotation(intArrayOf(2, 3, 1, 4, 0)), equalTo(3))
    }

    @Test
    fun bestRotation2() {
        assertThat(Solution().bestRotation(intArrayOf(1, 3, 0, 2, 4)), equalTo(0))
    }
}
