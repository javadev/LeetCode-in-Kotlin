package g0501_0600.s0540_single_element_in_a_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun singleNonDuplicate() {
        assertThat(
            Solution().singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)),
            equalTo(2)
        )
    }

    @Test
    fun singleNonDuplicate2() {
        assertThat(
            Solution().singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)), equalTo(10)
        )
    }
}
