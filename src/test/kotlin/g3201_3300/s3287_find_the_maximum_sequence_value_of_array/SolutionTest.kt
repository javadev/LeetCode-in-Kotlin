package g3201_3300.s3287_find_the_maximum_sequence_value_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat<Int>(Solution().maxValue(intArrayOf(2, 6, 7), 1), equalTo<Int>(5))
    }

    @Test
    fun maxValue2() {
        assertThat<Int>(Solution().maxValue(intArrayOf(4, 2, 5, 6, 7), 2), equalTo<Int>(2))
    }
}
