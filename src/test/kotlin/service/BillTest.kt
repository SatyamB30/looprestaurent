package service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BillTest{
    @Test
    fun `should give list from string`() {
        val bill = Bill()
        val actualbill = bill.getBill("Paneer 65, Watermelon Martini, Cosmopolitan ")
        val expectedBill = 502.5

        assertEquals(expectedBill,actualbill)
    }
}