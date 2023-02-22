package g0601_0700.s0692_top_k_frequent_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun topKFrequent() {
        assertThat(
            Solution()
                .topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2),
            equalTo(listOf("i", "love"))
        )
    }

    @Test
    fun topKFrequent2() {
        assertThat(
            Solution()
                .topKFrequent(
                    arrayOf(
                        "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is",
                        "is"
                    ),
                    4
                ),
            equalTo(listOf("the", "is", "sunny", "day"))
        )
    }
}
