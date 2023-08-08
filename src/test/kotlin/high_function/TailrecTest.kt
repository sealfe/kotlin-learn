package high_function

class TailrecTest {

    @org.junit.jupiter.api.Test
    fun test_list_map() {
        for ( i in 1..1000000){
            println(i)
        }
    }


tailrec fun findlistNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findlistNode(head.next, value)
}

    class ListNode {
        var value: Int = 0
        var next: ListNode? = null
    }

}


}