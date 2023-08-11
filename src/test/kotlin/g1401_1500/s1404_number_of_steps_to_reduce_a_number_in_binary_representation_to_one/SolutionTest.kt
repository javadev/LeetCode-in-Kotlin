package g1401_1500.s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSteps() {
        assertThat(Solution().numSteps("1101"), equalTo(6))
    }

    @Test
    fun numSteps2() {
        assertThat(Solution().numSteps("10"), equalTo(1))
    }

    @Test
    fun numSteps3() {
        assertThat(Solution().numSteps("1"), equalTo(0))
    }
}
