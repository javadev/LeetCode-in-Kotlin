package g1601_1700.s1646_get_maximum_in_generated_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGenerated() {
        assertThat(Solution().getMaximumGenerated(7), equalTo(3))
    }

    @Test
    fun maximumGenerated2() {
        assertThat(Solution().getMaximumGenerated(2), equalTo(1))
    }

    @Test
    fun maximumGenerated3() {
        assertThat(Solution().getMaximumGenerated(3), equalTo(2))
    }
}
