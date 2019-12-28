package com.renseki.sharing

import com.nhaarman.mockito_kotlin.mock
import com.renseki.sharing.exceptions.CoolException
import dummy.DummyClass
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

/**
 * Common Service Unit Test
 *
 * @since 2019-12-28
 * @author Ian Yulianto
 */
class CommonServiceUT {

    private val service = CommonService()

    @Test
    fun `getCanonicalName Test`() {
        //  Prepare parameter
        val cls = DummyClass::class.java

        //  Execute
        val canonicalName = service.getClassCanonicalName(cls)

        //  Assert
        assertEquals(
                "dummy.DummyClass",
                canonicalName
        )
    }
    @Test
    fun `getSimpleName Test`() {
        //  Prepare parameter
        val cls = DummyClass::class.java

        //  Execute
        val simpleName = service.getClassSimpleName(cls)

        //  Assert
        assertEquals(
                "DummyClass",
                simpleName
        )
    }

    @Test
    fun `alwaysThrowException Test`() {
        //  Execute with Assert
        assertThrows<CoolException> {
            service.alwaysThrowException()
        }.printStackTrace()
    }

    @ParameterizedTest
    @ValueSource( strings = ["one", "two", "three"] )
    fun `parameterizedToDo Test`(str: String) {
        //  Execute
        val result = service.parameterizedToDo(str)

        //  Assert
        assertEquals(
                "$str-@",
                result
        )
    }


}