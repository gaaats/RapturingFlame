package com.supersolid.honestfoo


sealed class DataFromApiResourcegtgtt<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : DataFromApiResourcegtgtt<T>(data)
    class Loading<T>(data: T? = null) : DataFromApiResourcegtgtt<T>(data)
    class Error<T>(message: String, data: T? = null) : DataFromApiResourcegtgtt<T>(data, message)
}