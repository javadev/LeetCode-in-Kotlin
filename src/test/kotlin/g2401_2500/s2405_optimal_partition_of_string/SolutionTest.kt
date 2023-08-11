package g2401_2500.s2405_optimal_partition_of_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionString() {
        assertThat(Solution().partitionString("abacaba"), equalTo(4))
    }

    @Test
    fun partitionString2() {
        assertThat(Solution().partitionString("ssssss"), equalTo(6))
    }
}
