package g3601_3700.s3638_maximum_balanced_shipments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxBalancedShipments() {
        assertThat<Int>(
            Solution().maxBalancedShipments(intArrayOf(2, 5, 1, 4, 3)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxBalancedShipments2() {
        assertThat<Int>(Solution().maxBalancedShipments(intArrayOf(4, 4)), equalTo<Int>(0))
    }
}
