package com.rana.mvvmrevisiontrial.data

data class Quote(val quoteText: String, val authorName : String){

    override fun toString(): String {
      return "$quoteText - $authorName"
    }
}
