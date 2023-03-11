package g0701_0800.s0777_swap_adjacent_in_lr_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canTransform() {
        assertThat(Solution().canTransform("RXXLRXRXL", "XRLXXRRLX"), equalTo(true))
    }

    @Test
    fun canTransform2() {
        assertThat(Solution().canTransform("X", "L"), equalTo(false))
    }
}
