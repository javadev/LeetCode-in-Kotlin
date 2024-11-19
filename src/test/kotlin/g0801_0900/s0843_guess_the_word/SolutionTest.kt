package g0801_0900.s0843_guess_the_word

import g0801_0900.s0843_guess_the_word.Solution.Master
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSecretWord() {
        val numCalls = intArrayOf(0)
        doFindSecretWord(numCalls)
        assertThat(numCalls[0] > 0, equalTo(true))
    }

    @Test
    fun findSecretWord2() {
        val numCalls = intArrayOf(0)
        doFindSecretWord(numCalls)
        assertThat(numCalls[0] > 0, equalTo(true))
    }

    @Test
    fun findSecretWord3() {
        val numCalls = intArrayOf(0)
        doFindSecretWord(numCalls)
        assertThat(numCalls[0] > 0, equalTo(true))
    }

    private fun doFindSecretWord(numCalls: IntArray) {
        Solution()
            .findSecretWord(
                arrayOf("acckzz", "ccbazz", "eiowzz", "abcczz"),
                object : Master {
                    override fun guess(word: String): Int {
                        numCalls[0]++
                        val result: Int = when (word) {
                            "acckzz" -> 6
                            "ccbazz" -> 3
                            "eiowzz" -> 2
                            "abcczz" -> 4
                            else -> -1
                        }
                        return result
                    }
                },
            )
    }
}
