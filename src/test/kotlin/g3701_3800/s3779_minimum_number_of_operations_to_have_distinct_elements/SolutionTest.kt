package g3701_3800.s3779_minimum_number_of_operations_to_have_distinct_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(3, 8, 3, 6, 5, 8)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(2, 2)), equalTo<Int>(1))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(4, 3, 5, 1, 2)),
            equalTo<Int>(0),
        )
    }
}
