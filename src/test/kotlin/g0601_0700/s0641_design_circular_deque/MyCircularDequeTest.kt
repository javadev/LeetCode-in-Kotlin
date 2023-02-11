package g0601_0700.s0641_design_circular_deque

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyCircularDequeTest {
    @Test
    fun myCircularDequeTest() {
        val myCircularDeque = MyCircularDeque(3)
        assertThat(myCircularDeque.insertLast(1), equalTo(true))
        assertThat(myCircularDeque.insertLast(2), equalTo(true))
        assertThat(myCircularDeque.insertFront(3), equalTo(true))
        assertThat(myCircularDeque.insertFront(4), equalTo(false))
        assertThat(myCircularDeque.getRear(), equalTo(2))
        assertThat(myCircularDeque.isFull(), equalTo(true))
        assertThat(myCircularDeque.deleteLast(), equalTo(true))
        assertThat(myCircularDeque.insertFront(4), equalTo(true))
        assertThat(myCircularDeque.getFront(), equalTo(4))
    }
}
