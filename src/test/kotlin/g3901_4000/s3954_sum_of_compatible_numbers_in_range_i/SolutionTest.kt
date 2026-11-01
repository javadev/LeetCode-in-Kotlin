package g3901_4000.s3954_sum_of_compatible_numbers_in_range_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfGoodIntegers() {
        assertThat<Int>(Solution().sumOfGoodIntegers(2, 3), equalTo<Int>(10))
    }

    @Test
    fun sumOfGoodIntegers2() {
        assertThat<Int>(Solution().sumOfGoodIntegers(5, 1), equalTo<Int>(0))
    }

    @Test
    fun sumOfGoodIntegers3() {
        assertThat<Int>(Solution().sumOfGoodIntegers(1, 1), equalTo<Int>(2))
    }
}
