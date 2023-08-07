import org.junit.jupiter.api.Test

/**
 * @Classname CompanionTest
 * @Description
 * @Date 2023/8/7 22:00
 * @author by fengww
 */



class CompanionTest  constructor(){
  companion object{
      fun test() {
          println("test")
      }
}

    fun test2() {
        println("test2")
    }



}


@Test
fun test() {
    CompanionTest.test()
    CompanionTest().test2()

}