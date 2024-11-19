package g1201_1300.s1253_reconstruct_a_2_row_binary_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reconstructMatrix() {
        assertThat(
            Solution().reconstructMatrix(2, 1, intArrayOf(1, 1, 1)),
            equalTo(listOf(mutableListOf(0, 1, 1), mutableListOf(1, 0, 0))),
        )
    }

    @Test
    fun reconstructMatrix2() {
        assertThat(
            Solution().reconstructMatrix(2, 3, intArrayOf(2, 2, 1, 1)),
            equalTo(emptyList<Any>()),
        )
    }

    @Test
    fun reconstructMatrix3() {
        assertThat(
            Solution().reconstructMatrix(5, 5, intArrayOf(2, 1, 2, 0, 1, 0, 1, 2, 0, 1)),
            equalTo(
                listOf(mutableListOf(1, 0, 1, 0, 0, 0, 1, 1, 0, 1), mutableListOf(1, 1, 1, 0, 1, 0, 0, 1, 0, 0)),
            ),
        )
    }
}
