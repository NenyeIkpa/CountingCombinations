import org.junit.Assert.*
import org.junit.Test

class CountingCombinationsTest {

        @Test
        fun shouldHandleTheExampleCase() {
            assertEquals(3, CountingCombinations().countChange(4, arrayListOf<Int>(1, 2)))
        }

        @Test
        fun shouldHandleAnotherSimpleCase() {
            assertEquals(4, CountingCombinations().countChange(10, arrayListOf<Int>(5, 2, 3)))
        }

        @Test
        fun shouldHandleNoChangeGiven() {
            assertEquals(0, CountingCombinations().countChange(11, arrayListOf<Int>(5, 7)))
        }

        @Test
        fun shouldHandleTheCoinsRegardlessOfOrder() {
            assertEquals(1022, CountingCombinations().countChange(300, arrayListOf<Int>(5, 10, 20, 50, 100, 200, 500)))
            assertEquals(1022, CountingCombinations().countChange(300, arrayListOf<Int>(500, 200, 100, 50, 20, 10, 5)))
        }

        @Test
        fun shouldHandleACaseWithNoPossibleCombinations() {
            assertEquals(0, CountingCombinations().countChange(301, arrayListOf<Int>(5, 10, 20, 50, 100, 200, 500)))
        }

        @Test
        fun shouldHandleSomeTougherCases() {
            assertEquals(760, CountingCombinations().countChange(199, arrayListOf<Int>(3, 5, 9, 15)))
            assertEquals(19, CountingCombinations().countChange(98, arrayListOf<Int>(3, 14, 8)))
            assertEquals(18515, CountingCombinations().countChange(419, arrayListOf<Int>(2, 5, 10, 20, 50)))
        }

}