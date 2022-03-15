package com.rana.mvvmrevisiontrial.ui.quotes

import androidx.lifecycle.ViewModel
import com.rana.mvvmrevisiontrial.data.Quote
import com.rana.mvvmrevisiontrial.data.QuoteRepo

class QuotesViewModel(private val quoteRepo: QuoteRepo) : ViewModel() {

    fun getQuote()= quoteRepo.getQuote()

    fun addQuote(quote : Quote) = quoteRepo.addQuote(quote)
}