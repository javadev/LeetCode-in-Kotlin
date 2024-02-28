package g3001_3100.s3011_find_if_array_can_be_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canSortArray() {
        assertThat(Solution().canSortArray(intArrayOf(8, 4, 2, 30, 15)), equalTo(true))
    }

    @Test
    fun canSortArray2() {
        assertThat(Solution().canSortArray(intArrayOf(1, 2, 3, 4, 5)), equalTo(true))
    }

    @Test
    fun canSortArray3() {
        assertThat(Solution().canSortArray(intArrayOf(3, 16, 8, 4, 2)), equalTo(false))
    }
}
