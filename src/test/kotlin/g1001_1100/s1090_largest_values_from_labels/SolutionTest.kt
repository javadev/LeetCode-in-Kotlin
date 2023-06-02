package g1001_1100.s1090_largest_values_from_labels

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestValsFromLabels() {
        assertThat(
            Solution()
                .largestValsFromLabels(intArrayOf(5, 4, 3, 2, 1), intArrayOf(1, 1, 2, 2, 3), 3, 1),
            equalTo(9)
        )
    }

    @Test
    fun largestValsFromLabels2() {
        assertThat(
            Solution()
                .largestValsFromLabels(intArrayOf(5, 4, 3, 2, 1), intArrayOf(1, 3, 3, 3, 2), 3, 2),
            equalTo(12)
        )
    }
}
