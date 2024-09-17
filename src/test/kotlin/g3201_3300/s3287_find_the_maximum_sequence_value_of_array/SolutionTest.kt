package g3201_3300.s3287_find_the_maximum_sequence_value_of_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        MatcherAssert.assertThat<Int?>(Solution().maxValue(intArrayOf(2, 6, 7), 1), CoreMatchers.equalTo<Int?>(5))
    }

    @Test
    fun maxValue2() {
        MatcherAssert.assertThat<Int?>(Solution().maxValue(intArrayOf(4, 2, 5, 6, 7), 2), CoreMatchers.equalTo<Int?>(2))
    }
}
