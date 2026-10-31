package g3701_3800.s3799_word_squares_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.*

internal class SolutionTest {
    @Test
    fun wordSquares() {
        val result: MutableList<MutableList<String>> =
            Solution().wordSquares(arrayOf<String>("able", "area", "echo", "also"))
        assertThat<MutableList<MutableList<String>>>(
            result,
            equalTo<MutableList<MutableList<String>>>(
                Arrays.asList<MutableList<String>>(
                    mutableListOf<String>("able", "area", "echo", "also"),
                    mutableListOf<String>("area", "able", "also", "echo"),
                ),
            ),
        )
    }

    @Test
    fun wordSquares2() {
        assertThat<MutableList<MutableList<String>>>(
            Solution().wordSquares(arrayOf<String>("code", "cafe", "eden", "edge")),
            equalTo<MutableList<out Any>>(mutableListOf<Any>()),
        )
    }
}
