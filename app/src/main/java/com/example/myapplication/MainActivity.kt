package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Celcius = false


       val checkBox: CheckBox = findViewById(R.id.checkBox)
        val switch: Switch = findViewById(R.id.switch1)
        var cityCoordinates= true
        val button: Button = findViewById(R.id.button)
        val temp: TextView = findViewById(R.id.Temperature)
        val cityy: TextView = findViewById(R.id.City)
        val descRiption: TextView = findViewById(R.id.textView3)
        val image: ImageView = findViewById(R.id.imageView)
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        val city = "Warsaw"
        var tempC= "23"
        var tempK= "296"
        var desc= "cloudy"
        var coordinates= "21.00 E 52.15 N"

        imageButton.setOnClickListener{
            Toast.makeText(this, "this is my Weather Aplication",  Toast.LENGTH_LONG).show();
        }

        checkBox.setOnClickListener{
            Celcius = !Celcius
            if(!Celcius){
                temp.text = "Temperature: " + tempC +"C"
            }else{
                temp.text = "Temperature: " + tempK+"K"
            }
        }

        switch.setOnClickListener{
            cityCoordinates = !cityCoordinates
            if(cityCoordinates){
                cityy.text = "City: "+city
            }else{
                cityy.text = "City: "+coordinates
            }
        }

        button.setOnClickListener{
            if(!Celcius){
                temp.text = "Temperature: " + tempC +"C"
            }else{
                temp.text = "Temperature: " + tempK+"K"
            }

            if(cityCoordinates){
                cityy.text = "City: "+city
            }else{
                cityy.text = "City: "+coordinates
            }

            descRiption.text = "Description: "+desc
            image.setImageResource(R.drawable.sunclouds)

        }



    }
}