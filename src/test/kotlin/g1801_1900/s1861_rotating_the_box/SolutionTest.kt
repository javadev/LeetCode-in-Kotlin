package g1801_1900.s1861_rotating_the_box

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotateTheBox() {
        assertThat(
            Solution().rotateTheBox(arrayOf(charArrayOf('#', '.', '#'))),
            equalTo(arrayOf(charArrayOf('.'), charArrayOf('#'), charArrayOf('#'))),
        )
    }

    @Test
    fun rotateTheBox2() {
        assertThat(
            Solution()
                .rotateTheBox(arrayOf(charArrayOf('#', '.', '*', '.'), charArrayOf('#', '#', '*', '.'))),
            equalTo(
                arrayOf(
                    charArrayOf('#', '.'),
                    charArrayOf('#', '#'),
                    charArrayOf('*', '*'),
                    charArrayOf('.', '.'),
                ),
            ),
        )
    }

    @Test
    fun rotateTheBox3() {
        assertThat(
            Solution()
                .rotateTheBox(
                    arrayOf(
                        charArrayOf('#', '#', '*', '.', '*', '.'),
                        charArrayOf('#', '#', '#', '*', '.', '.'),
                        charArrayOf('#', '#', '#', '.', '#', '.'),
                    ),
                ),
            equalTo(
                arrayOf(
                    charArrayOf('.', '#', '#'),
                    charArrayOf('.', '#', '#'),
                    charArrayOf('#', '#', '*'),
                    charArrayOf('#', '*', '.'),
                    charArrayOf('#', '.', '*'),
                    charArrayOf('#', '.', '.'),
                ),
            ),
        )
    }
}
