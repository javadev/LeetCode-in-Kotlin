package g2701_2800.s2772_apply_operations_to_make_all_array_elements_equal_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkArray() {
        assertThat(Solution().checkArray(intArrayOf(2, 2, 3, 1, 1, 0), 3), equalTo(true))
    }

    @Test
    fun checkArray2() {
        assertThat(Solution().checkArray(intArrayOf(1, 3, 1, 1), 2), equalTo(false))
    }
}
