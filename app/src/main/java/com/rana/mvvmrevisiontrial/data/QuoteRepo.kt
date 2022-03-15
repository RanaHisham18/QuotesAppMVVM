package com.rana.mvvmrevisiontrial.data

class QuoteRepo private constructor(private val quoteDao: FakeQouteDao){

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuote() = quoteDao.getQuote()

    companion object{
        @Volatile private var instance: QuoteRepo? = null

        fun getInstance(quoteDao: FakeQouteDao) =
            instance  ?: synchronized(this) {
                instance ?:QuoteRepo(quoteDao).also { instance = it }
            }
    }
}