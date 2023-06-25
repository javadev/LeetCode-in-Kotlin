package g2101_2200.s2164_sort_even_and_odd_indices_independently

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortEvenOdd() {
        MatcherAssert.assertThat(
            Solution().sortEvenOdd(intArrayOf(4, 1, 2, 3)),
            CoreMatchers.equalTo(intArrayOf(2, 3, 4, 1))
        )
    }

    @Test
    fun sortEvenOdd2() {
        MatcherAssert.assertThat(Solution().sortEvenOdd(intArrayOf(2, 1)), CoreMatchers.equalTo(intArrayOf(2, 1)))
    }
}
