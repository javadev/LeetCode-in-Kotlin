package g2001_2100.s2081_sum_of_k_mirror_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kMirror() {
        assertThat(Solution().kMirror(2, 5), equalTo(25L))
    }

    @Test
    fun kMirror2() {
        assertThat(Solution().kMirror(3, 7), equalTo(499L))
    }

    @Test
    fun kMirror3() {
        assertThat(Solution().kMirror(7, 17), equalTo(20379000L))
    }
}
