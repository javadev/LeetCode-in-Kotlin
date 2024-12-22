package g3301_3400.s3397_maximum_number_of_distinct_elements_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistinctElements() {
        assertThat<Int>(
            Solution().maxDistinctElements(intArrayOf(1, 2, 2, 3, 3, 4), 2),
            equalTo<Int>(6),
        )
    }

    @Test
    fun maxDistinctElements2() {
        assertThat<Int>(
            Solution().maxDistinctElements(intArrayOf(4, 4, 4, 4), 1),
            equalTo<Int>(3),
        )
    }
}
