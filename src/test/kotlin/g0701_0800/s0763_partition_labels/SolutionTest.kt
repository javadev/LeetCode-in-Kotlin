package g0701_0800.s0763_partition_labels

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun partitionLabels() {
        assertThat(
            Solution().partitionLabels("ababcbacadefegdehijhklij"),
            equalTo(Arrays.asList(9, 7, 8))
        )
    }

    @Test
    fun partitionLabels2() {
        assertThat(Solution().partitionLabels("eccbbbbdec"), equalTo(Arrays.asList(10)))
    }
}
