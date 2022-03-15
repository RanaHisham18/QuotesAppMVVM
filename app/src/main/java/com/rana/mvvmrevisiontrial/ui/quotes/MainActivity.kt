package com.rana.mvvmrevisiontrial.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.rana.mvvmrevisiontrial.R
import com.rana.mvvmrevisiontrial.data.Quote
import com.rana.mvvmrevisiontrial.utilities.InjectionUtils
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
        initializeUi()
    }

    private fun initializeUi(){
        val factory = InjectionUtils.provideQuotesViewModelFactory()
        val viewmodel = ViewModelProviders.of(this,factory)

            .get(QuotesViewModel::class.java)
        viewmodel.getQuote().observe(this, Observer { quotes ->  val StringBuilder = StringBuilder()
        quotes.forEach{quote -> StringBuilder. append("$quote \n \n")}

authorTV= findViewById<TextView>(R.id.textView_quote)
        })


    }

}