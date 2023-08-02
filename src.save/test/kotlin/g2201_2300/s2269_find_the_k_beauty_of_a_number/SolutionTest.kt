package g2201_2300.s2269_find_the_k_beauty_of_a_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divisorSubstrings() {
        assertThat(Solution().divisorSubstrings(240, 2), equalTo(2))
    }

    @Test
    fun divisorSubstrings2() {
        assertThat(Solution().divisorSubstrings(430043, 2), equalTo(2))
    }
}
