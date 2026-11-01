package g3801_3900.s3897_maximum_value_of_concatenated_binary_segments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat<Int>(
            Solution().maxValue(intArrayOf(1, 2), intArrayOf(1, 0)),
            equalTo<Int>(14),
        )
    }

    @Test
    fun maxValue2() {
        assertThat<Int>(
            Solution().maxValue(intArrayOf(3, 1), intArrayOf(0, 3)),
            equalTo<Int>(120),
        )
    }
}
