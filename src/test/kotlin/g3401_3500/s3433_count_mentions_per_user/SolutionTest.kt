package g3401_3500.s3433_count_mentions_per_user

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMentions() {
        assertThat<IntArray>(
            Solution()
                .countMentions(
                    2,
                    ArrayList<MutableList<String>>(
                        listOf<MutableList<String>>(
                            mutableListOf<String>("MESSAGE", "10", "id1 id0"),
                            mutableListOf<String>("OFFLINE", "11", "0"),
                            mutableListOf<String>("MESSAGE", "71", "HERE"),
                        ),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(2, 2)),
        )
    }

    @Test
    fun countMentions2() {
        assertThat<IntArray>(
            Solution()
                .countMentions(
                    2,
                    ArrayList<MutableList<String>>(
                        listOf<MutableList<String>>(
                            mutableListOf<String>("MESSAGE", "10", "id1 id0"),
                            mutableListOf<String>("OFFLINE", "11", "0"),
                            mutableListOf<String>("MESSAGE", "12", "ALL"),
                        ),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(2, 2)),
        )
    }

    @Test
    fun countMentions3() {
        assertThat<IntArray>(
            Solution()
                .countMentions(
                    2,
                    ArrayList<MutableList<String>>(
                        listOf<MutableList<String>>(
                            mutableListOf<String>("OFFLINE", "10", "0"),
                            mutableListOf<String>("MESSAGE", "12", "HERE"),
                        ),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }
}
