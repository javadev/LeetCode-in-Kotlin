package g1201_1300.s1206_design_skiplist

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SkiplistTest {
    @Test
    fun skiplist() {
        val skiplist = Skiplist()
        skiplist.add(1)
        skiplist.add(2)
        skiplist.add(3)
        MatcherAssert.assertThat(skiplist.search(0), CoreMatchers.equalTo(false))
        skiplist.add(4)
        MatcherAssert.assertThat(skiplist.search(1), CoreMatchers.equalTo(true))
        MatcherAssert.assertThat(skiplist.erase(0), CoreMatchers.equalTo(false))
        MatcherAssert.assertThat(skiplist.erase(1), CoreMatchers.equalTo(true))
        MatcherAssert.assertThat(skiplist.search(1), CoreMatchers.equalTo(false))
    }
}
