package g2401_2500.s2485_find_the_pivot_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pivotInteger() {
        assertThat(Solution().pivotInteger(8), equalTo(6))
    }

    @Test
    fun pivotInteger2() {
        assertThat(Solution().pivotInteger(1), equalTo(1))
    }

    @Test
    fun pivotInteger3() {
        assertThat(Solution().pivotInteger(4), equalTo(-1))
    }
}
