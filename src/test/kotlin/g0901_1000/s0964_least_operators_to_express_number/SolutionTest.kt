package g0901_1000.s0964_least_operators_to_express_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leastOpsExpressTarget() {
        assertThat(Solution().leastOpsExpressTarget(3, 19), equalTo(5))
    }

    @Test
    fun leastOpsExpressTarget2() {
        assertThat(Solution().leastOpsExpressTarget(5, 501), equalTo(8))
    }

    @Test
    fun leastOpsExpressTarget3() {
        assertThat(Solution().leastOpsExpressTarget(100, 100000000), equalTo(3))
    }
}
