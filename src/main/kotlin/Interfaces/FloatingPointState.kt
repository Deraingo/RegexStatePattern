package Interfaces

import FloatingPointDetector

interface FloatingPointState {
    fun handle(char: Char, context: FloatingPointDetector)
}