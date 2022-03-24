package se.magictechnology.piax24mar

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun letstest()
    {
        var model = StartViewmodel()

        model.addNumber()
        assertEquals(1, model.getTheNumber())

        model.resetNumber()
        assertEquals(0, model.getTheNumber())

        model.addNumber()
        model.addNumber()
        model.addNumber()
        model.addNumber()
        model.addNumber()
        model.addNumber()
        model.addNumber()
        model.addNumber()

        assertEquals(5, model.getTheNumber())

        model.resetNumber()
        model.addNumber()
        model.addNumber()
        model.minusNumber()
        assertEquals(1, model.getTheNumber())

        model.minusNumber()
        model.minusNumber()
        model.minusNumber()

        assertEquals(0, model.getTheNumber())
    }


}