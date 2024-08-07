package Interfaces

import IntegerDetector

interface IntegerState {
    fun handle(char: Char, context: IntegerDetector)
}