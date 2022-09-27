package com.sakshi.dimvvmproject.di

import android.provider.SyncStateContract
import com.sakshi.dimvvmproject.retrofit.FakerApi
import com.sakshi.dimvvmproject.utils.Constant
import com.sakshi.dimvvmproject.utils.Constant.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {


    @Singleton
    @Provides
    fun providesRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit) : FakerApi{
        return retrofit.create(FakerApi::class.java)
    }
}