package g1801_1900.s1896_minimum_cost_to_change_the_final_value_of_expression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperationsToFlip() {
        assertThat(Solution().minOperationsToFlip("1&(0|1)"), equalTo(1))
    }

    @Test
    fun minOperationsToFlip2() {
        assertThat(Solution().minOperationsToFlip("(0&0)&(0&0&0)"), equalTo(3))
    }

    @Test
    fun minOperationsToFlip3() {
        assertThat(Solution().minOperationsToFlip("(0|(1|0&1))"), equalTo(1))
    }
}
