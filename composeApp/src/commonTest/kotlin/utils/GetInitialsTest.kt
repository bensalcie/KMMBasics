package utils

import assertk.assertThat
import kotlin.test.Test
import kotlin.test.assertEquals

class GetInitialsTest {



    @Test
    fun testTwoNames() {
        assertEquals("BS", getInitials("Ben Salcie"))
    }

    @Test
    fun testSingleName() {
        assertEquals("BE", getInitials("Ben"))
    }

    @Test
    fun testThreeNames() {
        assertEquals("BI", getInitials("Benard Ngoda Imbwori"))
    }

    @Test
    fun testSingleCharacter() {
        assertEquals("B", getInitials("B"))
    }

    @Test
    fun testEmptyString() {
        assertEquals("", getInitials(""))
    }

    @Test
    fun testMultipleSpaces() {
        assertEquals("BS", getInitials("  Ben   Salcie  "))
    }

    @Test
    fun testLowercaseInput() {
        assertEquals("BS", getInitials("ben salcie"))
    }

    @Test
    fun getInitials(){
        val fullName = "Charity Mumbua Umau"
        assertThat(fullName).equals("CU")
    }

}
