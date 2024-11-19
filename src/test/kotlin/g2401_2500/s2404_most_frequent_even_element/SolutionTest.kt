package g2401_2500.s2404_most_frequent_even_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostFrequentEven() {
        assertThat(Solution().mostFrequentEven(intArrayOf(0, 1, 2, 2, 4, 4, 1)), equalTo(2))
    }

    @Test
    fun mostFrequentEven2() {
        assertThat(Solution().mostFrequentEven(intArrayOf(4, 4, 4, 9, 2, 4)), equalTo(4))
    }

    @Test
    fun mostFrequentEven3() {
        assertThat(
            Solution().mostFrequentEven(intArrayOf(29, 47, 21, 41, 13, 37, 25, 7)),
            equalTo(-1),
        )
    }
}
