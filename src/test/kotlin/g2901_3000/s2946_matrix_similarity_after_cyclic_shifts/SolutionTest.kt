package g2901_3000.s2946_matrix_similarity_after_cyclic_shifts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areSimilar() {
        assertThat(
            Solution()
                .areSimilar(arrayOf(intArrayOf(1, 2, 1, 2), intArrayOf(5, 5, 5, 5), intArrayOf(6, 3, 6, 3)), 2),
            equalTo(true)
        )
    }

    @Test
    fun areSimilar2() {
        assertThat(
            Solution().areSimilar(arrayOf(intArrayOf(2, 2), intArrayOf(2, 2)), 3),
            equalTo(true)
        )
    }

    @Test
    fun areSimilar3() {
        assertThat(Solution().areSimilar(arrayOf(intArrayOf(1, 2)), 1), equalTo(false))
    }
}
