package g1601_1700.s1611_minimum_one_bit_operations_to_make_integers_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOneBitOperations() {
        assertThat(Solution().minimumOneBitOperations(3), equalTo(2))
    }

    @Test
    fun minimumOneBitOperations2() {
        assertThat(Solution().minimumOneBitOperations(6), equalTo(4))
    }
}
