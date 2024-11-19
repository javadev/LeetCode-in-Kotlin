package g1201_1300.s1238_circular_permutation_in_binary_representation

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun circularPermutation() {
        val actual = Solution().circularPermutation(2, 3)
        assertThat(
            CommonUtils.compareArray(actual, mutableListOf<Int>(3, 2, 0, 1)),
            equalTo(true),
        )
    }

    @Test
    fun circularPermutation2() {
        val actual = Solution().circularPermutation(3, 2)
        assertThat(
            CommonUtils.compareArray(actual, mutableListOf<Int>(2, 6, 7, 5, 4, 0, 1, 3)),
            equalTo(true),
        )
    }
}
