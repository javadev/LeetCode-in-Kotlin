package g1601_1700.s1689_partitioning_into_minimum_number_of_deci_binary_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPartitions() {
        assertThat(Solution().minPartitions("32"), equalTo(3))
    }

    @Test
    fun minPartitions2() {
        assertThat(Solution().minPartitions("82734"), equalTo(8))
    }

    @Test
    fun minPartitions3() {
        assertThat(Solution().minPartitions("27346209830709182346"), equalTo(9))
    }
}
