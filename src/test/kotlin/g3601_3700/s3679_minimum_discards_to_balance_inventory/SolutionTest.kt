package g3601_3700.s3679_minimum_discards_to_balance_inventory

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minArrivalsToDiscard() {
        assertThat<Int>(
            Solution().minArrivalsToDiscard(intArrayOf(1, 2, 1, 3, 1), 4, 2), equalTo<Int>(0)
        )
    }

    @Test
    fun minArrivalsToDiscard2() {
        assertThat<Int>(
            Solution().minArrivalsToDiscard(intArrayOf(1, 2, 3, 3, 3, 4), 3, 2),
            equalTo<Int>(1)
        )
    }
}
