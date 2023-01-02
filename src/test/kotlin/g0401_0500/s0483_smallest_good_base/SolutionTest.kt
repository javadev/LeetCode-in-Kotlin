package g0401_0500.s0483_smallest_good_base

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestGoodBase() {
        assertThat(Solution().smallestGoodBase("13"), equalTo("3"))
    }

    @Test
    fun smallestGoodBase2() {
        assertThat(Solution().smallestGoodBase("4681"), equalTo("8"))
    }

    @Test
    fun smallestGoodBase3() {
        assertThat(
            Solution().smallestGoodBase("1000000000000000000"),
            equalTo("999999999999999999")
        )
    }
}
