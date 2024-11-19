package g0801_0900.s0826_most_profit_assigning_work

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfitAssignment() {
        assertThat(
            Solution()
                .maxProfitAssignment(
                    intArrayOf(2, 4, 6, 8, 10),
                    intArrayOf(10, 20, 30, 40, 50),
                    intArrayOf(4, 5, 6, 7),
                ),
            equalTo(100),
        )
    }

    @Test
    fun maxProfitAssignment2() {
        assertThat(
            Solution()
                .maxProfitAssignment(intArrayOf(85, 47, 57), intArrayOf(24, 66, 99), intArrayOf(40, 25, 25)),
            equalTo(0),
        )
    }
}
