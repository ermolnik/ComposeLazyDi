package ru.ermolnik.archapp.di

import android.util.Log
import javax.inject.Inject

interface Logger {
    fun v(tag: String, message: String)

    fun v(tag: String, s: String, th: Throwable)

    fun d(tag: String, message: String)

    fun d(tag: String, message: String, th: Throwable)

    fun i(tag: String, message: String)

    fun i(tag: String, message: String, th: Throwable)

    fun w(tag: String, message: String)

    fun w(tag: String, message: String, th: Throwable)

    fun e(tag: String, message: String)

    fun e(tag: String, message: String, th: Throwable)
}

class LoggerImpl @Inject constructor(): Logger {
    override fun v(tag: String, message: String) {
        Log.v(tag, message)
    }

    override fun v(tag: String, s: String, th: Throwable) {
        Log.v(tag, s, th)
    }

    override fun d(tag: String, message: String) {
        Log.d(tag, message)
    }

    override fun d(tag: String, message: String, th: Throwable) {
        Log.d(tag, message, th)
    }

    override fun i(tag: String, message: String) {
        Log.i(tag, message)
    }

    override fun i(tag: String, message: String, th: Throwable) {
        Log.i(tag, message)
    }

    override fun w(tag: String, message: String) {
        Log.w(tag, message)
    }

    override fun w(tag: String, message: String, th: Throwable) {
        Log.w(tag, message)
    }

    override fun e(tag: String, message: String) {
        Log.e(tag, message)
    }

    override fun e(tag: String, message: String, th: Throwable) {
        Log.e(tag, message, th)
    }
}