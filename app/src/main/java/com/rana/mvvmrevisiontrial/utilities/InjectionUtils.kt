package com.rana.mvvmrevisiontrial.utilities

import com.rana.mvvmrevisiontrial.data.FakeDataBase
import com.rana.mvvmrevisiontrial.data.QuoteRepo
import com.rana.mvvmrevisiontrial.ui.quotes.QuotesViewModelFactory

object InjectionUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
val quoteRepo = QuoteRepo.getInstance(FakeDataBase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepo)
    }
}