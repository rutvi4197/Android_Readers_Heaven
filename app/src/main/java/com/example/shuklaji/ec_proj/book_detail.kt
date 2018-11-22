package com.example.shuklaji.ec_proj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shuklaji.ec_proj.R.id.txt1
import com.example.shuklaji.ec_proj.R.id.txt3
import kotlinx.android.synthetic.main.activity_book_detail.*
import kotlinx.android.synthetic.main.book_ticket.*

class book_detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        val bundle = intent.extras

        img2.setImageResource(bundle.getInt("image"))
        txt2.text = bundle.getString("name")
        txt3.text=bundle.getString("des")
    }
}
