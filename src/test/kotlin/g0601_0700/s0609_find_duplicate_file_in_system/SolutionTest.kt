package g0601_0700.s0609_find_duplicate_file_in_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDuplicate() {
        assertThat(
            Solution()
                .findDuplicate(
                    arrayOf(
                        "root/a 1.txt(abcd) 2.txt(efgh)",
                        "root/c 3.txt(abcd)",
                        "root/c/d 4.txt(efgh)",
                        "root 4.txt(efgh)",
                    ),
                ),
            equalTo(
                listOf(
                    listOf("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
                    listOf("root/a/1.txt", "root/c/3.txt"),
                ),
            ),
        )
    }

    @Test
    fun findDuplicate2() {
        assertThat(
            Solution()
                .findDuplicate(
                    arrayOf(
                        "root/a 1.txt(abcd) 2.txt(efgh)",
                        "root/c 3.txt(abcd)",
                        "root/c/d 4.txt(efgh)",
                    ),
                ),
            equalTo(
                listOf(
                    listOf("root/a/2.txt", "root/c/d/4.txt"),
                    listOf("root/a/1.txt", "root/c/3.txt"),
                ),
            ),
        )
    }
}
