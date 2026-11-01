package g3901_4000.s3950_exactly_one_consecutive_set_bits_pair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun consecutiveSetBits() {
        assertThat<Boolean>(Solution().consecutiveSetBits(6), equalTo<Boolean>(true))
    }

    @Test
    fun consecutiveSetBits2() {
        assertThat<Boolean>(Solution().consecutiveSetBits(5), equalTo<Boolean>(false))
    }

    @Test
    fun consecutiveSetBits3() {
        assertThat<Boolean>(Solution().consecutiveSetBits(3), equalTo<Boolean>(true))
    }
}
