package g0401_0500.s0421_maximum_xor_of_two_numbers_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximumXOR() {
        assertThat(Solution().findMaximumXOR(intArrayOf(3, 10, 5, 25, 2, 8)), equalTo(28))
    }

    @Test
    fun findMaximumXOR2() {
        assertThat(
            Solution()
                .findMaximumXOR(intArrayOf(14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70)),
            equalTo(127),
        )
    }
}
