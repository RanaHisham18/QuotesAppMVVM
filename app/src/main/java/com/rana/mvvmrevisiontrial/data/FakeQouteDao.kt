package com.rana.mvvmrevisiontrial.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQouteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    //data can be easily observed by any changes

    init {
        quotes.value = quoteList
    }
    //set the value of quotes live data

    fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuote() = quotes as LiveData<List<Quote>>
}