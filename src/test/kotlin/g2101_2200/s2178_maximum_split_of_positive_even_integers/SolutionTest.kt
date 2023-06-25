package g2101_2200.s2178_maximum_split_of_positive_even_integers

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumEvenSplit() {
        MatcherAssert.assertThat(Solution().maximumEvenSplit(12), CoreMatchers.equalTo(mutableListOf(2L, 4L, 6L)))
    }

    @Test
    fun maximumEvenSplit2() {
        MatcherAssert.assertThat(Solution().maximumEvenSplit(7), CoreMatchers.equalTo(emptyList<Any>()))
    }

    @Test
    fun maximumEvenSplit3() {
        MatcherAssert.assertThat(Solution().maximumEvenSplit(28), CoreMatchers.equalTo(mutableListOf(2L, 4L, 6L, 16L)))
    }
}
