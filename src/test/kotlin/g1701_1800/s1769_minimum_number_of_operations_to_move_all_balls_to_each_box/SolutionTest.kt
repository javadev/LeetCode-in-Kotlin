package g1701_1800.s1769_minimum_number_of_operations_to_move_all_balls_to_each_box

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations("110"), equalTo(intArrayOf(1, 1, 3)))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations("001011"), equalTo(intArrayOf(11, 8, 5, 4, 3, 4)))
    }
}
