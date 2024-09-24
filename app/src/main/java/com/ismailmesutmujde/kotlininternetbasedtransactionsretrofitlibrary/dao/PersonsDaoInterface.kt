package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.dao

import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.CRUDAnswer
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.PersonsAnswer
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface PersonsDaoInterface {

    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded
    fun deletePerson(@Field("kisi_id") person_id:Int) : Call<CRUDAnswer>

    @POST("kisiler/insert_kisiler.php")
    @FormUrlEncoded
    fun insertPerson(@Field("kisi_ad") person_name: String,
                 @Field("kisi_tel") person_phone:String) : Call<CRUDAnswer>

    @POST("kisiler/update_kisiler.php")
    @FormUrlEncoded
    fun updatePerson(@Field("kisi_id") person_id: Int,
                     @Field("kisi_ad") person_name: String,
                     @Field("kisi_tel") person_phone:String) : Call<CRUDAnswer>

    @GET("kisiler/tum_kisiler.php")
    fun allPersons(): Call<PersonsAnswer>


}