package g2201_2300.s2235_add_two_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sum() {
        assertThat(Solution().sum(12, 5), equalTo(17))
    }

    @Test
    fun sum2() {
        assertThat(Solution().sum(-10, 4), equalTo(-6))
    }
}
