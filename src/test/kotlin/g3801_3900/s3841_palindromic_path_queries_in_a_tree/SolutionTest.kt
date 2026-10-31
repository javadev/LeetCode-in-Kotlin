package g3801_3900.s3841_palindromic_path_queries_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun palindromePath() {
        assertThat<MutableList<Boolean>>(
            Solution()
                .palindromePath(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)),
                    "aac",
                    arrayOf<String>("query 0 2", "update 1 b", "query 0 2"),
                ),
            equalTo<MutableList<Boolean>>(mutableListOf<Boolean>(true, false)),
        )
    }

    @Test
    fun palindromePath2() {
        assertThat<MutableList<Boolean>>(
            Solution()
                .palindromePath(
                    4,
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3)),
                    "abca",
                    arrayOf<String>(
                        "query 1 2",
                        "update 0 b",
                        "query 2 3",
                        "update 3 a",
                        "query 1 3",
                    ),
                ),
            equalTo<MutableList<Boolean>>(mutableListOf<Boolean>(false, false, true)),
        )
    }
}
