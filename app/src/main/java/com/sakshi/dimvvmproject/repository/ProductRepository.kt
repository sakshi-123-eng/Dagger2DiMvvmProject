package com.sakshi.dimvvmproject.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sakshi.dimvvmproject.model.ProductModel
import com.sakshi.dimvvmproject.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi : FakerApi){

    private val _products = MutableLiveData<List<ProductModel>>()
    val products: LiveData<List<ProductModel>>
        get() = _products

    suspend fun getProducts(){
        val result = fakerApi.getProducts()
        if(result.isSuccessful && result.body() != null){
            _products.postValue(result.body())
        }
    }

}