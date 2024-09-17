package com.example.quoteapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    companion object {
        // Array of motivational quotes
        private val quotes = arrayOf(
            "The only way to do great work is to love what you do.",
            "Don't let yesterday take up too much of today.",
            "You are never too old to set another goal or to dream a new dream.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Dream it. Wish it. Do it.",
            "Success doesn’t just find you. You have to go out and get it.",
            "Don’t stop when you’re tired. Stop when you’re done.",
            "The key to success is to focus on goals, not obstacles.",
            "Dream bigger. Do bigger.",
            "Your limitation—it’s only your imagination.",
            "Push yourself, because no one else is going to do it for you.",
            "Great things never come from comfort zones.",
            "Wake up with determination. Go to bed with satisfaction.",
            "Do something today that your future self will thank you for.",
            "Little things make big days.",
            "It’s going to be hard, but hard does not mean impossible.",
            "Don’t wait for opportunity. Create it.",
            "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
            "The only limit to our realization of tomorrow is our doubts of today.",
            "Difficult roads often lead to beautiful destinations."
        )

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteTextView: TextView = findViewById(R.id.quoteTextView)
        val changeQuoteButton: Button = findViewById(R.id.changeQuoteButton)

        initializeTextView(quoteTextView)

        displayRandomQuote(quoteTextView)

        changeQuoteButton.setOnClickListener {
            displayRandomQuote(quoteTextView)
        }
    }

    private fun initializeTextView(textView: TextView) {
        textView.apply {
            textSize = 24f
            setTextColor(Color.BLUE)
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }
    }

    private fun displayRandomQuote(textView: TextView) {
        val randomQuote = quotes.random()
        textView.text = randomQuote
    }
}
