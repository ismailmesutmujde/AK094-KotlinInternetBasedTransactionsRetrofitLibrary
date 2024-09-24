package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Persons(
    @SerializedName("kisi_id")
    @Expose
    var personId:Int,
    @SerializedName("kisi_ad")
    @Expose
    var personName:String,
    @SerializedName("kisi_tel")
    @Expose
    var personPhone:String) {

}