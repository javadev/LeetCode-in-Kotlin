package g1601_1700.s1611_minimum_one_bit_operations_to_make_integers_zero

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOneBitOperations() {
        MatcherAssert.assertThat(Solution().minimumOneBitOperations(3), CoreMatchers.equalTo(2))
    }

    @Test
    fun minimumOneBitOperations2() {
        MatcherAssert.assertThat(Solution().minimumOneBitOperations(6), CoreMatchers.equalTo(4))
    }
}
