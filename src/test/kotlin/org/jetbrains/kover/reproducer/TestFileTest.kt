package org.jetbrains.kover.reproducer

import org.junit.jupiter.api.Test

class TestFileTest {

    @Test
    fun shouldCheckFoo() {
        TestFile().foo()
    }

    @Test
    fun shouldCheckBar() {
        TestFile().bar()
    }
}
