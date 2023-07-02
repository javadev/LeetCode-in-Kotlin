package g0601_0700.s0667_beautiful_arrangement_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructArray() {
        assertThat(Solution().constructArray(3, 1), equalTo(intArrayOf(3, 2, 1)))
    }

    @Test
    fun constructArray2() {
        assertThat(Solution().constructArray(3, 2), equalTo(intArrayOf(1, 3, 2)))
    }
}
