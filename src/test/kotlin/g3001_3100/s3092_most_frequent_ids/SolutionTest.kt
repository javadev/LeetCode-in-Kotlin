package g3001_3100.s3092_most_frequent_ids

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostFrequentIDs() {
        assertThat(
            Solution().mostFrequentIDs(intArrayOf(2, 3, 2, 1), intArrayOf(3, 2, -3, 1)),
            equalTo(longArrayOf(3, 3, 2, 2)),
        )
    }

    @Test
    fun mostFrequentIDs2() {
        assertThat(
            Solution().mostFrequentIDs(intArrayOf(5, 5, 3), intArrayOf(2, -2, 1)),
            equalTo(longArrayOf(2, 0, 1)),
        )
    }
}
