package g3301_3400.s3309_maximum_possible_number_by_binary_concatenation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxGoodNumber() {
        assertThat<Int>(Solution().maxGoodNumber(intArrayOf(1, 2, 3)), equalTo<Int>(30))
    }

    @Test
    fun maxGoodNumber2() {
        assertThat<Int>(Solution().maxGoodNumber(intArrayOf(2, 8, 16)), equalTo<Int>(1296))
    }
}
