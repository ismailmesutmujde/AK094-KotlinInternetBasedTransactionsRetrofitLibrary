package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.dao

import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.CRUDAnswer
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface PersonsDaoInterface {

    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded
    fun deletePerson(@Field("kisi_id") person_id:Int) : Call<CRUDAnswer>


}