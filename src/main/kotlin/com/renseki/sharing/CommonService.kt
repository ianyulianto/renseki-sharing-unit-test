package com.renseki.sharing

import com.renseki.sharing.exceptions.CoolException
import kotlin.reflect.KClass

/**
 * Common Service
 *
 * @since 2019-12-28
 * @author Ian Yulianto
 */
class CommonService {

    fun getClassCanonicalName(cls: Class<*>) : String {
        return cls.canonicalName
    }

    fun getClassSimpleName(cls: Class<*>) : String {
        return cls.simpleName
    }

    fun alwaysThrowException() {
        throw CoolException()
    }

    fun parameterizedToDo(str: String) : String {
        return "$str-@"
    }
}