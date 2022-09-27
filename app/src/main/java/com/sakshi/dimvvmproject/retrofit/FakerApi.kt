package com.sakshi.dimvvmproject.retrofit

import com.sakshi.dimvvmproject.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {
    @GET("products")
    suspend fun getProducts() : Response<List<ProductModel>>
}