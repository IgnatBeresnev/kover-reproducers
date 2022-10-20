package org.jetbrains.kover.reproducer

import org.jetbrains.kover.reproducer.some.inner.pckg.PackageMismatchClass
import org.junit.jupiter.api.Test

class PackageMismatchTest {

    @Test
    fun foo() {
        PackageMismatchClass().foo()
    }
}
