package g0901_1000.s0904_fruit_into_baskets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalFruit() {
        assertThat(Solution().totalFruit(intArrayOf(1, 2, 1)), equalTo(3))
    }

    @Test
    fun totalFruit2() {
        assertThat(Solution().totalFruit(intArrayOf(0, 1, 2, 2)), equalTo(3))
    }

    @Test
    fun totalFruit3() {
        assertThat(Solution().totalFruit(intArrayOf(1, 2, 3, 2, 2)), equalTo(4))
    }
}
