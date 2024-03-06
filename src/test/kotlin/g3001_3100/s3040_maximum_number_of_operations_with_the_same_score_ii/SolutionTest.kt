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
}
