package g2701_2800.s2741_special_permutations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialPerm() {
        assertThat(Solution().specialPerm(intArrayOf(2, 3, 6)), equalTo(2))
    }

    @Test
    fun specialPerm2() {
        assertThat(Solution().specialPerm(intArrayOf(1, 4, 3)), equalTo(2))
    }
}
