package g0701_0800.s0707_design_linked_list

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyLinkedListTest {
    @Test
    fun myLinkedList() {
        val myLinkedList = MyLinkedList()
        myLinkedList.addAtHead(1)
        myLinkedList.addAtTail(3)
        myLinkedList.addAtIndex(1, 2)
        assertThat(myLinkedList[1], equalTo(2))
        myLinkedList.deleteAtIndex(1)
        assertThat(myLinkedList[1], equalTo(3))
    }

    @Test
    fun myLinkedList2() {
        val myLinkedList = MyLinkedList()
        myLinkedList.addAtHead(1)
        myLinkedList.addAtTail(3)
        myLinkedList.addAtIndex(1, 2)
        assertThat(myLinkedList[1], equalTo(2))
        myLinkedList.deleteAtIndex(0)
        assertThat(myLinkedList[0], equalTo(2))
    }
}
