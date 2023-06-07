package g1401_1500.s1432_max_difference_you_can_get_from_changing_an_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDiff() {
        assertThat(Solution().maxDiff(555), equalTo(888))
    }

    @Test
    fun maxDiff2() {
        assertThat(Solution().maxDiff(9), equalTo(8))
    }
}
