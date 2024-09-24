package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.R
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.CRUDAnswer
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.service.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //deletePerson()
        insertPerson()
    }

    fun deletePerson() {
        val pdi = ApiUtils.getPersonsDaoInterface()

        pdi.deletePerson(17721).enqueue(object : Callback<CRUDAnswer> {
            override fun onResponse(call: Call<CRUDAnswer>?, response: Response<CRUDAnswer>?) {
                if(response != null) {
                    Log.e("Success", response.body().success.toString())
                    Log.e("Message", response.body().message)
                }
            }

            override fun onFailure(call: Call<CRUDAnswer>?, t: Throwable?) {

            }
        })
    }

    fun insertPerson() {
        val pdi = ApiUtils.getPersonsDaoInterface()

        pdi.insertPerson("ismail","22222").enqueue(object : Callback<CRUDAnswer> {
            override fun onResponse(call: Call<CRUDAnswer>?, response: Response<CRUDAnswer>?) {

                if(response != null) {
                    Log.e("Success", response.body().success.toString())
                    Log.e("Message", response.body().message)
                }
            }

            override fun onFailure(call: Call<CRUDAnswer>?, t: Throwable?) {

            }
        })
    }
}