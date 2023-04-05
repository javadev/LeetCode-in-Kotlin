package g0601_0700.s0622_design_circular_queue

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyCircularQueueTest {
    @Test
    fun myCircularQueue() {
        val myCircularQueue = MyCircularQueue(3)
        assertThat(myCircularQueue.enQueue(1), equalTo(true))
        assertThat(myCircularQueue.enQueue(2), equalTo(true))
        assertThat(myCircularQueue.enQueue(3), equalTo(true))
        assertThat(myCircularQueue.enQueue(4), equalTo(false))
        assertThat(myCircularQueue.Rear(), equalTo(3))
        assertThat(myCircularQueue.isFull(), equalTo(true))
        assertThat(myCircularQueue.deQueue(), equalTo(true))
        assertThat(myCircularQueue.enQueue(4), equalTo(true))
        assertThat(myCircularQueue.Rear(), equalTo(4))
    }
}
