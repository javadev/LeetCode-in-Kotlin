package g3101_3200.s3190_find_minimum_operations_to_make_all_elements_divisible_by_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations(intArrayOf(1, 2, 3, 4)), equalTo(3))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations(intArrayOf(3, 6, 9)), equalTo(0))
    }
}
