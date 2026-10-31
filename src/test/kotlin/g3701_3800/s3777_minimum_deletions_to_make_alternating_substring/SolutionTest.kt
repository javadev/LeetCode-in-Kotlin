package g3701_3800.s3777_minimum_deletions_to_make_alternating_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletions() {
        assertThat<IntArray>(
            Solution().minDeletions(
                "ABA",
                arrayOf<IntArray>(intArrayOf(2, 1, 2), intArrayOf(1, 1), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(0, 2)),
        )
    }

    @Test
    fun minDeletions2() {
        assertThat<IntArray>(
            Solution().minDeletions(
                "ABB",
                arrayOf<IntArray>(intArrayOf(2, 0, 2), intArrayOf(1, 2), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(1, 0)),
        )
    }

    @Test
    fun minDeletions3() {
        assertThat<IntArray>(
            Solution().minDeletions(
                "BABA",
                arrayOf<IntArray>(intArrayOf(2, 0, 3), intArrayOf(1, 1), intArrayOf(2, 1, 3)),
            ),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }

    @Test
    fun minDeletions4() {
        // j == 0, tests j > 0 false branch
        // "AAB" -> flip index 0 -> "BAB"
        assertThat<IntArray>(
            Solution().minDeletions(
                "AAB",
                arrayOf<IntArray>(intArrayOf(2, 0, 2), intArrayOf(1, 0), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(1, 0)),
        )
    }

    @Test
    fun minDeletions5() {
        // j == n-1, tests j + 1 < n false branch
        // "ABB" -> flip index 2 -> "ABA"
        assertThat<IntArray>(
            Solution().minDeletions(
                "ABB",
                arrayOf<IntArray>(intArrayOf(2, 0, 2), intArrayOf(1, 2), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(1, 0)),
        )
    }

    @Test
    fun minDeletions6() {
        // tests a[j] == 'A' false branch (i.e., 'B' -> 'A')
        // "BAA" -> flip index 0 (B) -> "AAA"
        assertThat<IntArray>(
            Solution().minDeletions(
                "BAA",
                arrayOf<IntArray>(intArrayOf(2, 0, 2), intArrayOf(1, 0), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(1, 2)),
        )
    }

    @Test
    fun minDeletions7() {
        // tests a[j] == 'A' true branch
        // "AAA" -> flip index 1 -> "ABA"
        assertThat<IntArray>(
            Solution().minDeletions(
                "AAA",
                arrayOf<IntArray>(intArrayOf(2, 0, 2), intArrayOf(1, 1), intArrayOf(2, 0, 2)),
            ),
            equalTo<IntArray>(intArrayOf(2, 0)),
        )
    }

    @Test
    fun minDeletions8() {
        // tests l < r false branch
        assertThat<IntArray>(
            Solution().minDeletions("AAB", arrayOf<IntArray>(intArrayOf(2, 1, 1), intArrayOf(2, 0, 0))),
            equalTo<IntArray>(intArrayOf(0, 0)),
        )
    }

    @Test
    fun minDeletions9() {
        // larger string to exercise BIT loops more
        // "AABBA" -> pairs at index 0 (AA), 2 (BB)
        assertThat<IntArray>(
            Solution()
                .minDeletions(
                    "AABBA",
                    arrayOf<IntArray>(
                        intArrayOf(2, 0, 4),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0, 4),
                        intArrayOf(1, 0),
                        intArrayOf(2, 0, 4),
                        intArrayOf(2, 1, 3),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(2, 2, 1, 1)),
        )
    }

    @Test
    fun minDeletions10() {
        // All neighbor pairs match
        // "AAAA" -> flip middle to break/create pairs
        assertThat<IntArray>(
            Solution()
                .minDeletions(
                    "AAAA",
                    arrayOf<IntArray>(intArrayOf(2, 0, 3), intArrayOf(1, 2), intArrayOf(2, 0, 3), intArrayOf(2, 0, 1)),
                ),
            equalTo<IntArray>(intArrayOf(3, 1, 1)),
        )
    }

    @Test
    fun minDeletions11() {
        // No initial neighbor pairs - covers a[i] == a[i+1] false branch dominantly
        assertThat<IntArray>(
            Solution()
                .minDeletions(
                    "ABABAB",
                    arrayOf<IntArray>(intArrayOf(2, 0, 5), intArrayOf(1, 3), intArrayOf(2, 0, 5), intArrayOf(2, 2, 4)),
                ),
            equalTo<IntArray>(intArrayOf(0, 2, 2)),
        )
    }
}
