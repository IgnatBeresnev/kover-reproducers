package org.jetbrains.kover.reproducer

import org.junit.jupiter.api.Test

class TestFileTest {


    @Test
    fun shouldCheckFoo() {
        TestFile().foo()
    }

    @Test
    fun shouldCheckBar() {
        TestFile().foo()
    }

    @Test
    fun checkNothing() {
        // intellij with changed source file TestFile.kt
    }
}
