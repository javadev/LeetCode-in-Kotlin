package g3201_3300.s3229_minimum_operations_to_make_array_equal_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(
            Solution().minimumOperations(intArrayOf(3, 5, 1, 2), intArrayOf(4, 6, 2, 4)),
            equalTo(2L),
        )
    }

    @Test
    fun minimumOperations2() {
        assertThat(
            Solution().minimumOperations(intArrayOf(1, 3, 2), intArrayOf(2, 1, 4)),
            equalTo(5L),
        )
    }
}
