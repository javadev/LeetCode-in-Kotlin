package g1801_1900.s1899_merge_triplets_to_form_target_triplet

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeTriplets() {
        assertThat(
            Solution()
                .mergeTriplets(
                    arrayOf(intArrayOf(2, 5, 3), intArrayOf(1, 8, 4), intArrayOf(1, 7, 5)),
                    intArrayOf(2, 7, 5),
                ),
            equalTo(true),
        )
    }

    @Test
    fun mergeTriplets2() {
        assertThat(
            Solution()
                .mergeTriplets(arrayOf(intArrayOf(3, 4, 5), intArrayOf(4, 5, 6)), intArrayOf(3, 2, 5)),
            equalTo(false),
        )
    }

    @Test
    fun mergeTriplets3() {
        assertThat(
            Solution()
                .mergeTriplets(
                    arrayOf(
                        intArrayOf(2, 5, 3),
                        intArrayOf(2, 3, 4),
                        intArrayOf(1, 2, 5),
                        intArrayOf(5, 2, 3),
                    ),
                    intArrayOf(5, 5, 5),
                ),
            equalTo(true),
        )
    }
}
