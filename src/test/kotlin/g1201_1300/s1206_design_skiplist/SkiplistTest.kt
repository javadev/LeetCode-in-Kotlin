package g1201_1300.s1206_design_skiplist

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SkiplistTest {
    @Test
    fun skiplist() {
        val skiplist = Skiplist()
        skiplist.add(1)
        skiplist.add(2)
        skiplist.add(3)
        assertThat(skiplist.search(0), equalTo(false))
        skiplist.add(4)
        assertThat(skiplist.search(1), equalTo(true))
        assertThat(skiplist.erase(0), equalTo(false))
        assertThat(skiplist.erase(1), equalTo(true))
        assertThat(skiplist.search(1), equalTo(false))
    }
}
