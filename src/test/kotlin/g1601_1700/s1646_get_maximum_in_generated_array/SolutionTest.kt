package g1601_1700.s1646_get_maximum_in_generated_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val maximumGenerated: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaximumGenerated(7), CoreMatchers.equalTo(3))
        }

    @get:Test
    val maximumGenerated2: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaximumGenerated(2), CoreMatchers.equalTo(1))
        }

    @get:Test
    val maximumGenerated3: Unit
        get() {
            MatcherAssert.assertThat(Solution().getMaximumGenerated(3), CoreMatchers.equalTo(2))
        }
}
