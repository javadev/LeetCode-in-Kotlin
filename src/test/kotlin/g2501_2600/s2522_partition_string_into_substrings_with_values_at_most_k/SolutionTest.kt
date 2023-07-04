package g2501_2600.s2522_partition_string_into_substrings_with_values_at_most_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPartition() {
        assertThat(Solution().minimumPartition("165462", 60), equalTo(4))
    }

    @Test
    fun minimumPartition2() {
        assertThat(Solution().minimumPartition("238182", 5), equalTo(-1))
    }
}
