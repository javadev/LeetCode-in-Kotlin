package g0101_0200.s0134_gas_station

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canCompleteCircuit() {
        assertThat(
            Solution()
                .canCompleteCircuit(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2)),
            equalTo(3),
        )
    }

    @Test
    fun canCompleteCircuit2() {
        assertThat(
            Solution().canCompleteCircuit(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3)),
            equalTo(-1),
        )
    }
}
