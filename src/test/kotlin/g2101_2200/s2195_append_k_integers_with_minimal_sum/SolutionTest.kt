package g2101_2200.s2195_append_k_integers_with_minimal_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimalKSum() {
        MatcherAssert.assertThat(Solution().minimalKSum(intArrayOf(1, 4, 25, 10, 25), 2), CoreMatchers.equalTo(5L))
    }

    @Test
    fun minimalKSum2() {
        MatcherAssert.assertThat(Solution().minimalKSum(intArrayOf(5, 6), 6), CoreMatchers.equalTo(25L))
    }
}
