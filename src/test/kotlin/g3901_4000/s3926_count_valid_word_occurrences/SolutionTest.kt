package g3901_4000.s3926_count_valid_word_occurrences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countWordOccurrences() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>("hello wor", "ld hello"),
                    arrayOf<String>("hello", "world", "wor"),
                ),
            equalTo<IntArray>(intArrayOf(2, 1, 0)),
        )
    }

    @Test
    fun countWordOccurrences2() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>("a-b a--b ", "a-", "b"),
                    arrayOf<String>("a-b", "a", "b"),
                ),
            equalTo<IntArray>(intArrayOf(2, 1, 1)),
        )
    }

    @Test
    fun countWordOccurrences3() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>("-cat dog- mouse"),
                    arrayOf<String>("cat", "dog", "mouse", "cat-dog"),
                ),
            equalTo<IntArray>(intArrayOf(1, 1, 1, 0)),
        )
    }

    @Test
    fun countWordOccurrences4() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>(" -- ", "-"),
                    arrayOf<String>("a", "a-b"),
                ),
            equalTo<IntArray>(intArrayOf(0, 0)),
        )
    }

    @Test
    fun countWordOccurrences5() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>("a", "-", "b a", "-b-"),
                    arrayOf<String>("a-b", "a", "b", "a-b"),
                ),
            equalTo<IntArray>(intArrayOf(2, 0, 0, 2)),
        )
    }

    @Test
    fun countWordOccurrences6() {
        assertThat<IntArray>(
            Solution()
                .countWordOccurrences(
                    arrayOf<String>("a b ab a"),
                    arrayOf<String>("a", "ab", "abc", "b"),
                ),
            equalTo<IntArray>(intArrayOf(2, 1, 0, 1)),
        )
    }
}
