package com.example.quote.data

import com.example.quote.R
import com.example.quote.model.Quote

class Datasource {
    fun loadQuote(): List<Quote> {
        return listOf<Quote>(
            Quote(R.string.quote1, R.drawable.image1),
            Quote(R.string.quote2, R.drawable.image2),
            Quote(R.string.quote3, R.drawable.image3),
            Quote(R.string.quote4, R.drawable.image4),
            Quote(R.string.quote5, R.drawable.image5),
            Quote(R.string.quote6, R.drawable.image6),
            Quote(R.string.quote7, R.drawable.image7),
            Quote(R.string.quote8, R.drawable.image8)
        )
    }
}