package com.example.dtestapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform