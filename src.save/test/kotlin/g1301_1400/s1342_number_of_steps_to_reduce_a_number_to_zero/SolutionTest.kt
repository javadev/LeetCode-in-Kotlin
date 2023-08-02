package g1301_1400.s1342_number_of_steps_to_reduce_a_number_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSteps() {
        assertThat(Solution().numberOfSteps(14), equalTo(6))
    }

    @Test
    fun numberOfSteps2() {
        assertThat(Solution().numberOfSteps(8), equalTo(4))
    }
}
