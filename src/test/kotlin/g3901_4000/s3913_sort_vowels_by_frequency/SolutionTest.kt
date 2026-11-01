package g3901_4000.s3913_sort_vowels_by_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortVowels() {
        assertThat<String>(Solution().sortVowels("leetcode"), equalTo<String>("leetcedo"))
    }

    @Test
    fun sortVowels2() {
        assertThat<String>(
            Solution().sortVowels("aeiaaioooa"),
            equalTo<String>("aaaaoooiie"),
        )
    }

    @Test
    fun sortVowels3() {
        assertThat<String>(Solution().sortVowels("baeiou"), equalTo<String>("baeiou"))
    }

    @Test
    fun sortVowels4() {
        assertThat<String>(Solution().sortVowels("rhythm"), equalTo<String>("rhythm"))
    }

    @Test
    fun sortVowels5() {
        assertThat<String>(Solution().sortVowels("u"), equalTo<String>("u"))
    }

    @Test
    fun sortVowels6() {
        assertThat<String>(
            Solution().sortVowels("uoeaiuoeai"),
            equalTo<String>("uuooeeaaii"),
        )
    }

    @Test
    fun sortVowels7() {
        assertThat<String>(Solution().sortVowels("obabao"), equalTo<String>("obobaa"))
    }
}
