package g1901_2000.s1925_count_square_sum_triples

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTriples() {
        assertThat(Solution().countTriples(5), equalTo(2))
    }

    @Test
    fun countTriples2() {
        assertThat(Solution().countTriples(10), equalTo(4))
    }
}
