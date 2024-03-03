package g3001_3100.s3028_ant_on_the_boundary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun returnToBoundaryCount() {
        assertThat(Solution().returnToBoundaryCount(intArrayOf(2, 3, -5)), equalTo(1))
    }

    @Test
    fun returnToBoundaryCount2() {
        assertThat(Solution().returnToBoundaryCount(intArrayOf(3, 2, -3, -4)), equalTo(0))
    }
}
