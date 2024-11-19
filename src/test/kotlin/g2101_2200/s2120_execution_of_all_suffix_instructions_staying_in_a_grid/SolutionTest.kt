package g2101_2200.s2120_execution_of_all_suffix_instructions_staying_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun executeInstructions() {
        assertThat(
            Solution().executeInstructions(3, intArrayOf(0, 1), "RRDDLU"),
            equalTo(intArrayOf(1, 5, 4, 3, 1, 0)),
        )
    }

    @Test
    fun executeInstructions2() {
        assertThat(
            Solution().executeInstructions(2, intArrayOf(1, 1), "LURD"),
            equalTo(intArrayOf(4, 1, 0, 0)),
        )
    }

    @Test
    fun executeInstructions3() {
        assertThat(
            Solution().executeInstructions(1, intArrayOf(0, 0), "LRUD"),
            equalTo(intArrayOf(0, 0, 0, 0)),
        )
    }
}
