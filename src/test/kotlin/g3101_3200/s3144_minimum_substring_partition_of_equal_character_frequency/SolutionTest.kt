package g3101_3200.s3144_minimum_substring_partition_of_equal_character_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSubstringsInPartition() {
        assertThat(Solution().minimumSubstringsInPartition("fabccddg"), equalTo(3))
    }

    @Test
    fun minimumSubstringsInPartition2() {
        assertThat(Solution().minimumSubstringsInPartition("abababaccddb"), equalTo(2))
    }
}
