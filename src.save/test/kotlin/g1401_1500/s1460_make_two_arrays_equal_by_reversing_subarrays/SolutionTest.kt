package g1401_1500.s1460_make_two_arrays_equal_by_reversing_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeEqual() {
        assertThat(
            Solution().canBeEqual(intArrayOf(1, 2, 3, 4), intArrayOf(2, 4, 1, 3)),
            equalTo(true)
        )
    }

    @Test
    fun canBeEqual2() {
        assertThat(Solution().canBeEqual(intArrayOf(7), intArrayOf(7)), equalTo(true))
    }

    @Test
    fun canBeEqual3() {
        assertThat(
            Solution().canBeEqual(intArrayOf(3, 7, 9), intArrayOf(3, 7, 11)),
            equalTo(false)
        )
    }
}
