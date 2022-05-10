package com.arka.viewmodelretrofit

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getMoviewAll() =  retrofitService.getAllMovies()
}