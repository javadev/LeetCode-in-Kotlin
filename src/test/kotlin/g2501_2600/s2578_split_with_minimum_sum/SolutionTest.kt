package g2501_2600.s2578_split_with_minimum_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitNum() {
        assertThat(Solution().splitNum(4325), equalTo(59))
    }

    @Test
    fun splitNum2() {
        assertThat(Solution().splitNum(687), equalTo(75))
    }
}
