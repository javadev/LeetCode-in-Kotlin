package g3901_4000.s3993_maximum_value_of_an_alternating_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumValue() {
        assertThat<Long>(Solution().maximumValue(4, 3, 5), equalTo<Long>(12L))
    }

    @Test
    fun maximumValue2() {
        assertThat<Long>(Solution().maximumValue(2, 4, 3), equalTo<Long>(7L))
    }

    @Test
    fun maximumValue3() {
        assertThat<Long>(Solution().maximumValue(1, 5, 3), equalTo<Long>(5L))
    }
}
