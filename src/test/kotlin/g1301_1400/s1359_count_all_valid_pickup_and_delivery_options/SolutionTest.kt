package g1301_1400.s1359_count_all_valid_pickup_and_delivery_options

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOrders() {
        assertThat(Solution().countOrders(1), equalTo(1))
    }

    @Test
    fun countOrders2() {
        assertThat(Solution().countOrders(2), equalTo(6))
    }

    @Test
    fun countOrders3() {
        assertThat(Solution().countOrders(3), equalTo(90))
    }
}
