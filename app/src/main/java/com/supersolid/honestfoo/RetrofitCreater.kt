package com.supersolid.honestfoo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitCreater {
    companion object{
        val apiDevil = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://rapturingflame.xyz/")
            .build()
            .create(DevilApiifrfrrrf::class.java)
    }
}