package g0801_0900.s0838_push_dominoes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pushDominoes() {
        assertThat(Solution().pushDominoes("RR.L"), equalTo("RR.L"))
    }

    @Test
    fun pushDominoes2() {
        assertThat(Solution().pushDominoes(".L.R...LR..L.."), equalTo("LL.RR.LLRRLL.."))
    }
}
