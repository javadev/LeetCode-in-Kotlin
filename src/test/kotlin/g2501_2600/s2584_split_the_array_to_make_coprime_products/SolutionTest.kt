package g2501_2600.s2584_split_the_array_to_make_coprime_products

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findValidSplit() {
        assertThat(Solution().findValidSplit(intArrayOf(4, 7, 8, 15, 3, 5)), equalTo(2))
    }

    @Test
    fun findValidSplit2() {
        assertThat(Solution().findValidSplit(intArrayOf(4, 7, 15, 8, 3, 5)), equalTo(-1))
    }
}
