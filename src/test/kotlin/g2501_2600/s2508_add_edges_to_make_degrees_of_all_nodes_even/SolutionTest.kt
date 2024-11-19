package g2501_2600.s2508_add_edges_to_make_degrees_of_all_nodes_even

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossible() {
        assertThat(
            Solution()
                .isPossible(
                    5,
                    getLists(
                        arrayOf(
                            intArrayOf(1, 2),
                            intArrayOf(2, 3),
                            intArrayOf(3, 4),
                            intArrayOf(4, 2),
                            intArrayOf(1, 4),
                            intArrayOf(2, 5),
                        ),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPossible2() {
        assertThat(
            Solution().isPossible(4, getLists(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))),
            equalTo(true),
        )
    }

    @Test
    fun isPossible3() {
        assertThat(
            Solution()
                .isPossible(4, getLists(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4)))),
            equalTo(false),
        )
    }

    @Test
    fun isPossible4() {
        assertThat(
            Solution()
                .isPossible(
                    21,
                    getLists(
                        arrayOf(
                            intArrayOf(2, 19),
                            intArrayOf(16, 17),
                            intArrayOf(8, 14),
                            intArrayOf(2, 16),
                            intArrayOf(12, 20),
                            intArrayOf(12, 14),
                            intArrayOf(16, 18),
                            intArrayOf(15, 16),
                            intArrayOf(10, 21),
                            intArrayOf(3, 5),
                            intArrayOf(13, 18),
                            intArrayOf(17, 20),
                            intArrayOf(14, 17),
                            intArrayOf(9, 12),
                            intArrayOf(5, 15),
                            intArrayOf(5, 6),
                            intArrayOf(3, 7),
                            intArrayOf(2, 21),
                            intArrayOf(10, 13),
                            intArrayOf(8, 16),
                            intArrayOf(7, 18),
                            intArrayOf(4, 6),
                            intArrayOf(9, 1),
                            intArrayOf(13, 21),
                            intArrayOf(18, 20),
                            intArrayOf(7, 14),
                            intArrayOf(4, 19),
                            intArrayOf(5, 8),
                            intArrayOf(3, 11),
                            intArrayOf(11, 1),
                            intArrayOf(7, 12),
                            intArrayOf(4, 7),
                            intArrayOf(3, 16),
                            intArrayOf(13, 17),
                            intArrayOf(17, 19),
                            intArrayOf(9, 13),
                            intArrayOf(7, 19),
                            intArrayOf(10, 16),
                            intArrayOf(4, 13),
                            intArrayOf(4, 5),
                            intArrayOf(2, 15),
                            intArrayOf(12, 19),
                            intArrayOf(11, 16),
                            intArrayOf(2, 9),
                            intArrayOf(11, 17),
                            intArrayOf(17, 1),
                            intArrayOf(16, 21),
                            intArrayOf(4, 10),
                            intArrayOf(10, 14),
                            intArrayOf(14, 16),
                            intArrayOf(4, 1),
                            intArrayOf(13, 20),
                            intArrayOf(5, 20),
                            intArrayOf(4, 14),
                            intArrayOf(4, 21),
                            intArrayOf(10, 20),
                            intArrayOf(2, 14),
                            intArrayOf(8, 15),
                            intArrayOf(4, 8),
                            intArrayOf(6, 19),
                            intArrayOf(15, 1),
                            intArrayOf(19, 1),
                            intArrayOf(8, 19),
                            intArrayOf(15, 21),
                            intArrayOf(3, 12),
                            intArrayOf(11, 18),
                            intArrayOf(9, 17),
                            intArrayOf(18, 19),
                            intArrayOf(7, 21),
                            intArrayOf(3, 21),
                            intArrayOf(16, 19),
                            intArrayOf(11, 15),
                            intArrayOf(5, 1),
                            intArrayOf(8, 17),
                            intArrayOf(3, 15),
                            intArrayOf(8, 1),
                            intArrayOf(10, 19),
                            intArrayOf(3, 8),
                            intArrayOf(6, 16),
                            intArrayOf(2, 8),
                            intArrayOf(5, 18),
                            intArrayOf(11, 13),
                            intArrayOf(11, 20),
                            intArrayOf(14, 21),
                            intArrayOf(6, 20),
                            intArrayOf(4, 20),
                            intArrayOf(12, 13),
                            intArrayOf(5, 12),
                            intArrayOf(10, 11),
                            intArrayOf(9, 15),
                            intArrayOf(3, 19),
                            intArrayOf(9, 20),
                            intArrayOf(14, 18),
                            intArrayOf(21, 1),
                            intArrayOf(13, 19),
                            intArrayOf(8, 21),
                            intArrayOf(2, 13),
                            intArrayOf(3, 10),
                            intArrayOf(9, 18),
                            intArrayOf(19, 21),
                            intArrayOf(6, 7),
                            intArrayOf(3, 18),
                            intArrayOf(2, 18),
                            intArrayOf(6, 14),
                            intArrayOf(3, 17),
                            intArrayOf(5, 21),
                            intArrayOf(14, 20),
                            intArrayOf(8, 9),
                            intArrayOf(16, 1),
                            intArrayOf(3, 4),
                            intArrayOf(13, 1),
                            intArrayOf(5, 9),
                            intArrayOf(4, 15),
                            intArrayOf(17, 21),
                            intArrayOf(20, 21),
                            intArrayOf(2, 17),
                            intArrayOf(13, 14),
                            intArrayOf(11, 14),
                            intArrayOf(9, 16),
                            intArrayOf(10, 18),
                            intArrayOf(6, 15),
                            intArrayOf(6, 12),
                            intArrayOf(3, 13),
                            intArrayOf(5, 11),
                            intArrayOf(6, 1),
                            intArrayOf(12, 17),
                            intArrayOf(8, 10),
                            intArrayOf(5, 10),
                            intArrayOf(8, 18),
                            intArrayOf(4, 12),
                            intArrayOf(10, 1),
                            intArrayOf(6, 13),
                            intArrayOf(4, 18),
                            intArrayOf(7, 20),
                            intArrayOf(7, 16),
                            intArrayOf(2, 6),
                            intArrayOf(12, 21),
                            intArrayOf(4, 17),
                            intArrayOf(15, 18),
                            intArrayOf(13, 16),
                            intArrayOf(15, 20),
                            intArrayOf(7, 10),
                            intArrayOf(6, 10),
                            intArrayOf(2, 20),
                            intArrayOf(7, 15),
                            intArrayOf(18, 1),
                            intArrayOf(12, 1),
                            intArrayOf(3, 20),
                            intArrayOf(7, 1),
                            intArrayOf(14, 15),
                            intArrayOf(4, 9),
                            intArrayOf(11, 19),
                            intArrayOf(7, 9),
                            intArrayOf(5, 17),
                            intArrayOf(18, 21),
                            intArrayOf(6, 21),
                            intArrayOf(8, 11),
                            intArrayOf(6, 17),
                            intArrayOf(3, 14),
                            intArrayOf(7, 11),
                            intArrayOf(5, 7),
                            intArrayOf(7, 13),
                            intArrayOf(6, 8),
                            intArrayOf(6, 9),
                            intArrayOf(10, 12),
                            intArrayOf(5, 16),
                            intArrayOf(2, 4),
                            intArrayOf(17, 18),
                            intArrayOf(9, 11),
                            intArrayOf(12, 16),
                            intArrayOf(3, 6),
                            intArrayOf(12, 18),
                            intArrayOf(3, 9),
                            intArrayOf(11, 12),
                            intArrayOf(14, 19),
                            intArrayOf(10, 15),
                            intArrayOf(5, 13),
                            intArrayOf(8, 13),
                            intArrayOf(15, 17),
                            intArrayOf(2, 10),
                            intArrayOf(11, 21),
                            intArrayOf(20, 1),
                            intArrayOf(6, 18),
                            intArrayOf(2, 12),
                            intArrayOf(19, 20),
                            intArrayOf(6, 11),
                            intArrayOf(8, 12),
                            intArrayOf(2, 3),
                            intArrayOf(12, 15),
                            intArrayOf(2, 11),
                            intArrayOf(9, 10),
                            intArrayOf(7, 17),
                            intArrayOf(9, 19),
                            intArrayOf(13, 15),
                            intArrayOf(7, 8),
                            intArrayOf(4, 11),
                            intArrayOf(2, 5),
                            intArrayOf(5, 19),
                            intArrayOf(16, 20),
                            intArrayOf(15, 19),
                            intArrayOf(9, 14),
                            intArrayOf(14, 1),
                            intArrayOf(10, 17),
                            intArrayOf(9, 21),
                            intArrayOf(2, 7),
                            intArrayOf(8, 20),
                            intArrayOf(5, 14),
                            intArrayOf(4, 16),
                        ),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPossible5() {
        assertThat(
            Solution()
                .isPossible(
                    6,
                    getLists(
                        arrayOf(
                            intArrayOf(1, 6),
                            intArrayOf(1, 3),
                            intArrayOf(1, 4),
                            intArrayOf(4, 5),
                            intArrayOf(5, 2),
                        ),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPossible6() {
        assertThat(
            Solution()
                .isPossible(
                    4,
                    getLists(arrayOf(intArrayOf(4, 1), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(1, 3))),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPossible7() {
        assertThat(
            Solution()
                .isPossible(
                    4,
                    getLists(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(3, 4))),
                ),
            equalTo(false),
        )
    }
}
