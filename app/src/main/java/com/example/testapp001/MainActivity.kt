package com.example.testapp001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button切り替え用のフラグ
        var flag = false

        // リスナーをボタンに登録
        button.setOnClickListener {

            if (flag) {
                // flagがtrueの時
                textview.setText(getString(R.string.hello))
                flag = false
            } else {
                // flagがfalseの時
                textview.setText(getString(R.string.world))
                flag = true
            }
        }
    }
}