package com.theesaran.thizar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform