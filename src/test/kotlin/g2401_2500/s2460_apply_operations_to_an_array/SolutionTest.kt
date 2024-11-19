package g2401_2500.s2460_apply_operations_to_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun applyOperations() {
        assertThat(
            Solution().applyOperations(intArrayOf(1, 2, 2, 1, 1, 0)),
            equalTo(intArrayOf(1, 4, 2, 0, 0, 0)),
        )
    }

    @Test
    fun applyOperations2() {
        assertThat(Solution().applyOperations(intArrayOf(0, 1)), equalTo(intArrayOf(1, 0)))
    }
}
