package com.rana.mvvmrevisiontrial.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rana.mvvmrevisiontrial.data.QuoteRepo

class QuotesViewModelFactory (private val quoteRepo: QuoteRepo) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepo) as T
    }
}