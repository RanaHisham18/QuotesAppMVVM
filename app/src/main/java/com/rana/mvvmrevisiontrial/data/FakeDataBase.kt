package com.rana.mvvmrevisiontrial.data

class FakeDataBase(){

    var quoteDao = FakeQouteDao()
        private set
    companion object{
        @Volatile private var instance: FakeDataBase? = null

        fun getInstance() =
            instance  ?: synchronized(this) {
                instance ?: FakeDataBase().also { instance = it }
            }
    }
}