package g2401_2500.s2456_most_popular_video_creator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostPopularCreator() {
        assertThat(
            Solution()
                .mostPopularCreator(
                    arrayOf("alice", "bob", "alice", "chris"),
                    arrayOf("one", "two", "three", "four"),
                    intArrayOf(5, 10, 5, 4)
                ),
            equalTo(
                listOf(
                    mutableListOf("bob", "two"),
                    mutableListOf("alice", "one")
                )
            )
        )
    }

    @Test
    fun mostPopularCreator2() {
        assertThat(
            Solution()
                .mostPopularCreator(arrayOf("alice", "alice", "alice"), arrayOf("a", "b", "c"), intArrayOf(1, 2, 2)),
            equalTo(listOf<List<String>>(mutableListOf("alice", "b")))
        )
    }
}
