package g3301_3400.s3396_minimum_number_of_operations_to_make_elements_in_array_distinct

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat<Int>(
            Solution().minimumOperations(intArrayOf(1, 2, 3, 4, 2, 3, 3, 5, 7)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumOperations2() {
        assertThat<Int>(
            Solution().minimumOperations(intArrayOf(4, 5, 6, 4, 4)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumOperations3() {
        assertThat<Int>(
            Solution().minimumOperations(intArrayOf(6, 7, 8, 9)),
            equalTo<Int>(0),
        )
    }
}
