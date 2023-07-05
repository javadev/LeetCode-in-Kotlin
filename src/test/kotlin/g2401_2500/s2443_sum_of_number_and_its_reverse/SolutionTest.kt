package g2401_2500.s2443_sum_of_number_and_its_reverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfNumberAndReverse() {
        assertThat(Solution().sumOfNumberAndReverse(443), equalTo(true))
    }

    @Test
    fun sumOfNumberAndReverse2() {
        assertThat(Solution().sumOfNumberAndReverse(63), equalTo(false))
    }

    @Test
    fun sumOfNumberAndReverse3() {
        assertThat(Solution().sumOfNumberAndReverse(181), equalTo(true))
    }
}
