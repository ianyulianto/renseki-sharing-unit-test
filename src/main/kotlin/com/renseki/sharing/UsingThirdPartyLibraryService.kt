package com.renseki.sharing

import com.renseki.sharing.annotation.ManlyManAnnotation
import org.reflections.Reflections
import javax.annotation.PostConstruct

/**
 * Using Third Party Service
 *
 * @since 2019-12-28
 * @author Ian Yulianto
 */
class UsingThirdPartyLibraryService {

    lateinit var reflections: Reflections
    lateinit var otherService: OtherServiceInterface

    @PostConstruct
    fun postConstruct() {
        //  TODO Initialize Reflection here
    }

    fun getDummyClasses() : Collection<Class<*>> {
        return reflections.getTypesAnnotatedWith(ManlyManAnnotation::class.java)
    }

    fun makeMeAwesome(str: String) {
        val parse = "$str-xxx"
        otherService.makeMeAwesome(parse)
    }

}