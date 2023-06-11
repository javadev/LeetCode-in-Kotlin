package g1201_1300.s1222_queens_that_can_attack_the_king

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun queensAttacktheKing() {
        val actual = Solution()
            .queensAttacktheKing(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0),
                    intArrayOf(4, 0),
                    intArrayOf(0, 4),
                    intArrayOf(3, 3),
                    intArrayOf(2, 4)
                ),
                intArrayOf(0, 0)
            )
        val expected = listOf(mutableListOf(0, 1), mutableListOf(1, 0), mutableListOf(3, 3))
        assertThat(
            CommonUtils.compareMatrix(actual, expected),
            equalTo(true)
        )
    }

    @Test
    fun queensAttacktheKing2() {
        val actual = Solution()
            .queensAttacktheKing(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 4),
                    intArrayOf(3, 5),
                    intArrayOf(4, 4),
                    intArrayOf(4, 5)
                ),
                intArrayOf(3, 3)
            )
        val expected = listOf(mutableListOf(2, 2), mutableListOf(3, 4), mutableListOf(4, 4))
        assertThat(
            CommonUtils.compareMatrix(actual, expected),
            equalTo(true)
        )
    }

    @Test
    fun queensAttacktheKing3() {
        val actual = Solution()
            .queensAttacktheKing(
                arrayOf(
                    intArrayOf(5, 6),
                    intArrayOf(7, 7),
                    intArrayOf(2, 1),
                    intArrayOf(0, 7),
                    intArrayOf(1, 6),
                    intArrayOf(5, 1),
                    intArrayOf(3, 7),
                    intArrayOf(0, 3),
                    intArrayOf(4, 0),
                    intArrayOf(1, 2),
                    intArrayOf(6, 3),
                    intArrayOf(5, 0),
                    intArrayOf(0, 4),
                    intArrayOf(2, 2),
                    intArrayOf(1, 1),
                    intArrayOf(6, 4),
                    intArrayOf(5, 4),
                    intArrayOf(0, 0),
                    intArrayOf(2, 6),
                    intArrayOf(4, 5),
                    intArrayOf(5, 2),
                    intArrayOf(1, 4),
                    intArrayOf(7, 5),
                    intArrayOf(2, 3),
                    intArrayOf(0, 5),
                    intArrayOf(4, 2),
                    intArrayOf(1, 0),
                    intArrayOf(2, 7),
                    intArrayOf(0, 1),
                    intArrayOf(4, 6),
                    intArrayOf(6, 1),
                    intArrayOf(0, 6),
                    intArrayOf(4, 3),
                    intArrayOf(1, 7)
                ),
                intArrayOf(3, 4)
            )
        val expected = listOf(
            mutableListOf(2, 3),
            mutableListOf(1, 4),
            mutableListOf(1, 6),
            mutableListOf(3, 7),
            mutableListOf(4, 3),
            mutableListOf(5, 4),
            mutableListOf(4, 5)
        )
        assertThat(
            CommonUtils.compareMatrix(actual, expected),
            equalTo(true)
        )
    }
}
