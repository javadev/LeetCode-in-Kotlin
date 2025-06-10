package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumDistinctTriplet() {
        assertThat<Int>(
            Solution()
                .maxSumDistinctTriplet(
                    intArrayOf(1, 2, 1, 3, 2),
                    intArrayOf(5, 3, 4, 6, 2),
                ),
            equalTo<Int>(14),
        )
    }

    @Test
    fun maxSumDistinctTriplet2() {
        assertThat<Int>(
            Solution()
                .maxSumDistinctTriplet(intArrayOf(1, 2, 1, 2), intArrayOf(4, 5, 6, 7)),
            equalTo<Int>(-1),
        )
    }
}
