package com.semsols.retrofit_api


import retrofit2.Call
import retrofit2.http.GET

interface ApiInterfaceService {

    //Interface to get data

    @GET("/posts")

    fun getPost() : Call<MutableList<PostModel>>


}