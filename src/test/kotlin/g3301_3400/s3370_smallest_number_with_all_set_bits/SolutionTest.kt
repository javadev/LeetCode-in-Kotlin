package g3301_3400.s3370_smallest_number_with_all_set_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        assertThat<Int>(Solution().smallestNumber(5), equalTo<Int>(7))
    }

    @Test
    fun smallestNumber2() {
        assertThat<Int>(Solution().smallestNumber(10), equalTo<Int>(15))
    }

    @Test
    fun smallestNumber3() {
        assertThat<Int>(Solution().smallestNumber(3), equalTo<Int>(3))
    }
}
