package g2501_2600.s2562_find_the_array_concatenation_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheArrayConcVal() {
        assertThat(
            Solution().findTheArrayConcVal(intArrayOf(7, 52, 2, 4)),
            equalTo(596)
        )
    }

    @Test
    fun findTheArrayConcVal2() {
        assertThat(
            Solution().findTheArrayConcVal(intArrayOf(5, 14, 13, 8, 12)),
            equalTo(673)
        )
    }
}
