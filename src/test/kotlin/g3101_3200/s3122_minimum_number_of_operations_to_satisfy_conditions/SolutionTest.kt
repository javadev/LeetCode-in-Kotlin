package g3101_3200.s3122_minimum_number_of_operations_to_satisfy_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(
            Solution().minimumOperations(arrayOf(intArrayOf(1, 0, 2), intArrayOf(1, 0, 2))),
            equalTo(0),
        )
    }

    @Test
    fun minimumOperations2() {
        assertThat(
            Solution().minimumOperations(arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 0, 0))),
            equalTo(3),
        )
    }
}
