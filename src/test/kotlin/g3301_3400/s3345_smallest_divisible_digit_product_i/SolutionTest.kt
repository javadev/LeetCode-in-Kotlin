package g3301_3400.s3345_smallest_divisible_digit_product_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        assertThat<Int>(Solution().smallestNumber(10, 2), equalTo<Int>(10))
    }

    @Test
    fun smallestNumber2() {
        assertThat<Int>(Solution().smallestNumber(15, 3), equalTo<Int>(16))
    }
}
