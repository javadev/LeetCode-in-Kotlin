package g2101_2200.s2178_maximum_split_of_positive_even_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumEvenSplit() {
        assertThat(Solution().maximumEvenSplit(12), equalTo(mutableListOf(2L, 4L, 6L)))
    }

    @Test
    fun maximumEvenSplit2() {
        assertThat(Solution().maximumEvenSplit(7), equalTo(emptyList<Any>()))
    }

    @Test
    fun maximumEvenSplit3() {
        assertThat(Solution().maximumEvenSplit(28), equalTo(mutableListOf(2L, 4L, 6L, 16L)))
    }
}
