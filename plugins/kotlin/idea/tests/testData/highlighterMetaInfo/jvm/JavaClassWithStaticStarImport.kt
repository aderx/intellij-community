// FIR_IDENTICAL
// WITH_STDLIB
// ISSUE: KT-73649
// IGNORE_K2
// FILE: main.kt
open class KotlinClass {
    fun foo(): JavaClass? = null
}

// FILE: JavaClass.java
// BATCH_MODE
import static KotlinClass.*;

@Deprecated
public class JavaClass {
}
