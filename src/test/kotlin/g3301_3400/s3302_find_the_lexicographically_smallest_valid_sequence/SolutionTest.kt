package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validSequence() {
        assertThat<IntArray>(
            Solution().validSequence("vbcca", "abc"),
            equalTo<IntArray>(intArrayOf(0, 1, 2)),
        )
    }

    @Test
    fun validSequence2() {
        assertThat<IntArray>(
            Solution().validSequence("bacdc", "abc"),
            equalTo<IntArray>(intArrayOf(1, 2, 4)),
        )
    }

    @Test
    fun validSequence3() {
        assertThat<IntArray>(
            Solution().validSequence("aaaaaa", "aaabc"),
            equalTo<IntArray>(intArrayOf()),
        )
    }

    @Test
    fun validSequence4() {
        assertThat<IntArray>(
            Solution().validSequence("abc", "ab"),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }
}
