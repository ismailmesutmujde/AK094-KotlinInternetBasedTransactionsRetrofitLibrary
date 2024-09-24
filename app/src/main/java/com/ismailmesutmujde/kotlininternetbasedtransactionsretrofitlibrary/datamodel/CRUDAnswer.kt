package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// CRUD: Create, Update, Delete
data class CRUDAnswer(
    @SerializedName("success")
    @Expose
    var success:Int,
    @SerializedName("message")
    @Expose
    var message: String) {

}