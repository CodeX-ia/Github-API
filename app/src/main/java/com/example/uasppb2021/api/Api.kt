package com.example.uasppb2021.api

import com.example.github.data.model.DetailUserResponse
import com.example.uasppb2021.data.model.User
import com.example.uasppb2021.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSeachUsers(
        @Query("q") query: String
    ): Call<UserResponse>
    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>
    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>
    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}