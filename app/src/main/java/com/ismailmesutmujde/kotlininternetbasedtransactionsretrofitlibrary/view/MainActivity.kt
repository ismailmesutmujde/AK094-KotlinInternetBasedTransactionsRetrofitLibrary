package com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.R
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.CRUDAnswer
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.datamodel.PersonsAnswer
import com.ismailmesutmujde.kotlininternetbasedtransactionsretrofitlibrary.service.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //deletePerson()
        //insertPerson()
        //updatePerson()
        //allPersons()
        searchPerson()
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

    fun updatePerson() {
        val pdi = ApiUtils.getPersonsDaoInterface()

        pdi.updatePerson(17723,"ismail2","12341231234").enqueue(object : Callback<CRUDAnswer> {
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

    fun allPersons() {
        val pdi = ApiUtils.getPersonsDaoInterface()
        pdi.allPersons().enqueue(object : Callback<PersonsAnswer>{
            override fun onResponse(call: Call<PersonsAnswer>?, response: Response<PersonsAnswer>?) {
                if (response != null) {
                    val personsList = response.body().persons

                    for(p in personsList) {
                        Log.e("***********","***********")
                        Log.e("Person id", (p.personId).toString())
                        Log.e("Person name", (p.personName))
                        Log.e("Person phone", (p.personPhone))
                    }
                }
            }

            override fun onFailure(call: Call<PersonsAnswer>?, t: Throwable?) {

            }
        })
    }

    fun searchPerson() {
        val pdi = ApiUtils.getPersonsDaoInterface()
        pdi.searchPerson("i").enqueue(object : Callback<PersonsAnswer>{
            override fun onResponse(call: Call<PersonsAnswer>?, response: Response<PersonsAnswer>?) {
                if (response != null) {
                    val personsList = response.body().persons

                    for(p in personsList) {
                        Log.e("***********","***********")
                        Log.e("Person id", (p.personId).toString())
                        Log.e("Person name", (p.personName))
                        Log.e("Person phone", (p.personPhone))
                    }
                }
            }

            override fun onFailure(call: Call<PersonsAnswer>?, t: Throwable?) {

            }
        })
    }

}