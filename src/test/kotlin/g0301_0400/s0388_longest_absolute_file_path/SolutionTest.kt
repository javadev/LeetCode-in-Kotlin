package g0301_0400.s0388_longest_absolute_file_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthLongestPath() {
        val input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
        assertThat(Solution().lengthLongestPath(input), equalTo(20))
    }

    @Test
    fun lengthLongestPath2() {
        val intput = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
        assertThat(Solution().lengthLongestPath(intput), equalTo(32))
    }

    @Test
    fun lengthLongestPath3() {
        val intput = "a"
        assertThat(Solution().lengthLongestPath(intput), equalTo(0))
    }

    @Test
    fun lengthLongestPath4() {
        val intput = "file1.txt\nfile2.txt\nlongfile.txt"
        assertThat(Solution().lengthLongestPath(intput), equalTo(12))
    }
}
