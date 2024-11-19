package g2101_2200.s2197_replace_non_coprime_numbers_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun replaceNonCoprimes() {
        assertThat(
            Solution().replaceNonCoprimes(intArrayOf(6, 4, 3, 2, 7, 6, 2)),
            equalTo(mutableListOf(12, 7, 6)),
        )
    }

    @Test
    fun replaceNonCoprimes2() {
        assertThat(
            Solution().replaceNonCoprimes(intArrayOf(2, 2, 1, 1, 3, 3, 3)),
            equalTo(mutableListOf(2, 1, 1, 3)),
        )
    }

    @Test
    fun replaceNonCoprimes3() {
        assertThat(
            Solution()
                .replaceNonCoprimes(intArrayOf(287, 41, 49, 287, 899, 23, 23, 20677, 5, 825)),
            equalTo(mutableListOf(2009, 20677, 825)),
        )
    }
}
