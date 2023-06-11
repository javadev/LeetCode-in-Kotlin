package g1501_1600.s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumberOperations() {
        MatcherAssert.assertThat(Solution().minNumberOperations(intArrayOf(1, 2, 3, 2, 1)), CoreMatchers.equalTo(3))
    }

    @Test
    fun minNumberOperations2() {
        MatcherAssert.assertThat(Solution().minNumberOperations(intArrayOf(3, 1, 1, 2)), CoreMatchers.equalTo(4))
    }

    @Test
    fun minNumberOperations3() {
        MatcherAssert.assertThat(Solution().minNumberOperations(intArrayOf(3, 1, 5, 4, 2)), CoreMatchers.equalTo(7))
    }
}
