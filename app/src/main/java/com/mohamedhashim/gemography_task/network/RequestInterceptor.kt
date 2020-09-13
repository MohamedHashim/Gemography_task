package com.mohamedhashim.gemography_task.network

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalUrl = originalRequest.url

        val url = originalUrl.newBuilder()
            .build()

        val requestBuilder = originalRequest.newBuilder().url(url)
        val request = requestBuilder.build()

        return chain.proceed(request)
    }
}