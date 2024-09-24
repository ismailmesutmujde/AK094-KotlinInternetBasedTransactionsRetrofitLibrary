package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.service

import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.dao.PersonsDaoInterface
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.retrofit.RetrofitClient

class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getPersonsDaoInterface() : PersonsDaoInterface {
            return  RetrofitClient.getClient(BASE_URL).create(PersonsDaoInterface::class.java)
        }
    }
}