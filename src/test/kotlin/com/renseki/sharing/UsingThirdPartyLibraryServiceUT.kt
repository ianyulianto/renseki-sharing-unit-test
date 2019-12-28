package com.renseki.sharing

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import com.renseki.sharing.annotation.ManlyManAnnotation
import dummy.DummyClass
import org.junit.jupiter.api.Test
import org.reflections.Reflections
import kotlin.test.assertEquals

/**
 * Using Third Party Library Service Unit Test
 *
 * @since 2019-12-28
 * @author Ian Yulianto
 */
class UsingThirdPartyLibraryServiceUT {

    private val service = UsingThirdPartyLibraryService()

    @Test
    fun `getDummyClasses Test`() {
        //  Mock
        val reflections: Reflections = mock()
        service.reflections = reflections

        whenever(
                reflections.getTypesAnnotatedWith(ManlyManAnnotation::class.java)
        ).thenReturn(
                setOf(DummyClass::class.java)
        )

        //  Execute
        val classes = service.getDummyClasses()

        //  Assert
        assertEquals(
                setOf(DummyClass::class.java),
                classes
        )
    }


    @Test
    fun `makeMeAwesome Test`() {
        //  Parameter
        val param = "Hello World"

        //  Mock
        val otherService : OtherServiceInterface = mock()
        service.otherService = otherService

        //  Execute
        service.makeMeAwesome(param)

        //  Verify
        verify(otherService)
                .makeMeAwesome("$param-xxx")
    }
}