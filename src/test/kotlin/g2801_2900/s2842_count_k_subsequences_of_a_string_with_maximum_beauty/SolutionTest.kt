package g2801_2900.s2842_count_k_subsequences_of_a_string_with_maximum_beauty

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKSubsequencesWithMaxBeauty() {
        assertThat(Solution().countKSubsequencesWithMaxBeauty("bcca", 2), equalTo(4))
    }

    @Test
    fun countKSubsequencesWithMaxBeauty2() {
        assertThat(Solution().countKSubsequencesWithMaxBeauty("abbcd", 4), equalTo(2))
    }
}
