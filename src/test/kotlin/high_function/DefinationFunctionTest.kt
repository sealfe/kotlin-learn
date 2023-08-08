package high_function

import kotlin.test.Test

class DefinationFunctionTest {
    @Test
    fun test_list_map(){
        val list = listOf(1, 2, 3, 4, 5)
        val map = list.map { it * 2 }
        println(map)
    }

    @Test
    fun test_list_filter(){
        val list = listOf(1, 2, 3, 4, 5)
        val filter = list.filter { it % 2 == 0 }
        println(filter)
    }

    @Test
    fun test_list_reduce(){
        val list = listOf(1, 2, 3, 4, 5)
        val reduce = list.reduce { acc, i -> acc + i }
        println(reduce)
    }

    @Test
    fun test_list_fold(){
        val list = listOf(1, 2, 3, 4, 5)
        val fold = list.fold(10) { acc, i -> acc + i }
        println(fold)
    }

    @Test
    fun test_list_foldRight(){
        val list = listOf("1", "2", "3", "4", "5")
        val foldRight = list.foldRight("10") { acc, i -> acc + i }
        println(foldRight)
    }

    //test takeWhile
    @Test
    fun test_list_takeWhile(){
        val list = listOf(1, 2, 3, 4, 5)
        val takeWhile = list.takeWhile { it < 3 }
        println(takeWhile)
    }



    data class Person(val name: String, val age: Int)

    @Test
    //test let
    fun test_let(){
        val person = Person("fengww", 18)
        val let = person.let {
            it

        }
        println(let)
    }

    @Test
    //test apply
    fun test_apply(){
        val person = Person("fengww", 18)
        val apply = person.apply {
            println(this)
        }
        println(apply)
    }

    @Test
    //test with
    fun test_with(){
        val person = Person("fengww", 18)
        val with = with(person) {
            this
        }
        println(with)
    }




}



