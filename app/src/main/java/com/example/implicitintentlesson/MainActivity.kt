package com.example.implicitintentlesson

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webButton = findViewById<CardView>(R.id.CardWeb)
        val camButton = findViewById<CardView>(R.id.CardCamera)
        val mediaButton = findViewById<CardView>(R.id.CardMedia)
        val callButton = findViewById<CardView>(R.id.CardCall)

        webButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://colorhunt.co/")
            startActivity(intent)
        }
        camButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        mediaButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW);
            intent.data= Uri.parse("https://www.youtube.com/watch?v=kDXIqj6OhLI")
            startActivity(intent)
        }
        callButton.setOnClickListener{
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + 8462023497) //change the number
            startActivity(callIntent)
        }
    }
}