package g1401_1500.s1481_least_number_of_unique_integers_after_k_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLeastNumOfUniqueInts() {
        assertThat(Solution().findLeastNumOfUniqueInts(intArrayOf(5, 5, 4), 1), equalTo(1))
    }

    @Test
    fun findLeastNumOfUniqueInts2() {
        assertThat(
            Solution().findLeastNumOfUniqueInts(intArrayOf(4, 3, 1, 1, 3, 3, 2), 3),
            equalTo(2),
        )
    }
}
