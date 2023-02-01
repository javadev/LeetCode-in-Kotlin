package g0401_0500.s0410_split_array_largest_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitArray() {
        assertThat(Solution().splitArray(intArrayOf(7, 2, 5, 10, 8), 2), equalTo(18))
    }

    @Test
    fun splitArray2() {
        assertThat(Solution().splitArray(intArrayOf(1, 2, 3, 4, 5), 2), equalTo(9))
    }

    @Test
    fun splitArray3() {
        assertThat(Solution().splitArray(intArrayOf(1, 4, 4), 3), equalTo(4))
    }
}
