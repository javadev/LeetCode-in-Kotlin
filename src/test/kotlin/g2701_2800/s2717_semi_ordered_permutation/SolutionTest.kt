package g2701_2800.s2717_semi_ordered_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun semiOrderedPermutation() {
        assertThat(
            Solution().semiOrderedPermutation(intArrayOf(2, 1, 4, 3)),
            equalTo(2)
        )
    }

    @Test
    fun semiOrderedPermutation2() {
        assertThat(
            Solution().semiOrderedPermutation(intArrayOf(2, 4, 1, 3)),
            equalTo(3)
        )
    }

    @Test
    fun semiOrderedPermutation3() {
        assertThat(
            Solution().semiOrderedPermutation(intArrayOf(1, 3, 4, 2, 5)),
            equalTo(0)
        )
    }
}
