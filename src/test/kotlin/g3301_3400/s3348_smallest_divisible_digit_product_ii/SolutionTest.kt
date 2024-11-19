package g3301_3400.s3348_smallest_divisible_digit_product_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        assertThat<String>(
            Solution().smallestNumber("1234", 256L),
            equalTo<String>("1488"),
        )
    }

    @Test
    fun smallestNumber2() {
        assertThat<String>(
            Solution().smallestNumber("12355", 50L),
            equalTo<String>("12355"),
        )
    }

    @Test
    fun smallestNumber3() {
        assertThat<String>(Solution().smallestNumber("11111", 26L), equalTo<String>("-1"))
    }

    @Test
    fun smallestNumber4() {
        assertThat<String>(Solution().smallestNumber("10", 320L), equalTo<String>("588"))
    }

    @Test
    fun smallestNumber5() {
        assertThat<String>(Solution().smallestNumber("19", 2L), equalTo<String>("21"))
    }
}
