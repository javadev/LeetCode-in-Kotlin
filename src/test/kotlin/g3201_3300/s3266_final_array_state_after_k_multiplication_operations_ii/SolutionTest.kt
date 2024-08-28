package g3201_3300.s3266_final_array_state_after_k_multiplication_operations_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalState() {
        assertThat(
            Solution().getFinalState(intArrayOf(2, 1, 3, 5, 6), 5, 2),
            equalTo(intArrayOf(8, 4, 6, 5, 6))
        )
    }

    @Test
    fun finalState2() {
        assertThat(
            Solution().getFinalState(intArrayOf(100000, 2000), 2, 1000000),
            equalTo(intArrayOf(999999307, 999999993))
        )
    }
}
