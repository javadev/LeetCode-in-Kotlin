package g2201_2300.s2284_sender_with_largest_word_count

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestWordCount() {
        assertThat(
            Solution()
                .largestWordCount(
                    arrayOf(
                        "Hello userTwooo",
                        "Hi userThree",
                        "Wonderful day Alice",
                        "Nice day userThree",
                    ),
                    arrayOf("Alice", "userTwo", "userThree", "Alice"),
                ),
            equalTo("Alice"),
        )
    }

    @Test
    fun largestWordCount2() {
        assertThat(
            Solution()
                .largestWordCount(
                    arrayOf(
                        "How is leetcode for everyone",
                        "Leetcode is useful for practice",
                    ),
                    arrayOf("Bob", "Charlie"),
                ),
            equalTo("Charlie"),
        )
    }
}
