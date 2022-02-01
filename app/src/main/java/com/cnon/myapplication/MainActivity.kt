package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class kisiler(var id: String,var ad: String)
{

    override fun toString() : String
    {
        return "Ad: $ad, Id: $id"
    }

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sinan=kisiler("1","Sinan")
        println(sinan)


    }
}