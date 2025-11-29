package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxOperations() {
        assertThat(Solution().maxOperations(intArrayOf(3, 2, 1, 2, 3, 4)), equalTo(3))
    }

    @Test
    fun maxOperations2() {
        assertThat(Solution().maxOperations(intArrayOf(3, 2, 6, 1, 4)), equalTo(2))
    }

    @Test
    fun maxOperations3() {
        assertThat(Solution().maxOperations(intArrayOf(1, 2)), equalTo(1))
    }

    @Test
    fun maxOperations4() {
        assertThat(Solution().maxOperations(intArrayOf(1, 1, 1)), equalTo(1))
    }

    @Test
    fun maxOperations5() {
        assertThat(Solution().maxOperations(intArrayOf(2, 2, 2, 2, 2, 2)), equalTo(3))
    }

    @Test
    fun maxOperations6() {
        assertThat(Solution().maxOperations(intArrayOf(1, 2, 3, 4, 5, 6)), equalTo(3))
    }

    @Test
    fun maxOperations7() {
        assertThat(Solution().maxOperations(intArrayOf(6, 5, 4, 3, 2, 1)), equalTo(3))
    }

    @Test
    fun maxOperations8() {
        assertThat(Solution().maxOperations(intArrayOf(1, 3, 2, 4, 1, 3)), equalTo(2))
    }

    @Test
    fun maxOperations9() {
        assertThat(Solution().maxOperations(intArrayOf(1, 2, 4, 5)), equalTo(2))
    }

    @Test
    fun maxOperations10() {
        assertThat(Solution().maxOperations(intArrayOf(5, 5)), equalTo(1))
    }
}
