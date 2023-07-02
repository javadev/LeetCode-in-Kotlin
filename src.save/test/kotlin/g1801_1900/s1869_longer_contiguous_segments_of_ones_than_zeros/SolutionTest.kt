package g1801_1900.s1869_longer_contiguous_segments_of_ones_than_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkZeroOnes() {
        assertThat(Solution().checkZeroOnes("1101"), equalTo(true))
    }

    @Test
    fun checkZeroOnes2() {
        assertThat(Solution().checkZeroOnes("111000"), equalTo(false))
    }

    @Test
    fun checkZeroOnes3() {
        assertThat(Solution().checkZeroOnes("110100010"), equalTo(false))
    }
}
