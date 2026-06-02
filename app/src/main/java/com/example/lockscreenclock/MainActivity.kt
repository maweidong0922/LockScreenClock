package com.example.lockscreenclock

import android.app.KeyguardManager
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    private lateinit var timeTextView: TextView
    private lateinit var dateTextView: TextView
    private var timer: Timer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 璁剧疆涓洪攣灞忓绾告樉绀?        setShowAsWallpaper()
        
        // 绉婚櫎鏍囬鏍?        requestWindowFeature(WINDOW_FEATURE_NO_TITLE)
        
        // 璁剧疆甯冨眬
        val view = View.inflate(this, R.layout.activity_main, null)
        setContentView(view)
        
        timeTextView = findViewById(R.id.timeTextView)
        dateTextView = findViewById(R.id.dateTextView)
        
        // 鍚姩璁℃椂鍣ㄦ瘡绉掓洿鏂版椂闂?        startTimer()
    }
    
    private fun setShowAsWallpaper() {
        // 璁╁簲鐢ㄦ樉绀哄湪閿佸睆涓?        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O_MR1) {
            setShowWhenLocked(true)
            setTurnScreenOn(true)
        } else {
            @Suppress("DEPRECATION")
            window.addFlags(
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED or
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON or
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
            )
        }
    }
    
    private fun startTimer() {
        updateTime() // 绔嬪嵆鏇存柊涓€娆?        
        timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                runOnUiThread { updateTime() }
            }
        }, 0, 1000) // 姣忕鏇存柊
    }
    
    private fun updateTime() {
        val currentTime = Date()
        
        // 鏍煎紡鍖栨椂闂?(HH:mm:ss 鏍煎紡锛屾樉绀哄皬鏃躲€佸垎閽熴€佺)
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val timeString = timeFormat.format(currentTime)
        
        // 鏍煎紡鍖栨棩鏈?        val dateFormat = SimpleDateFormat("yyyy-MM-dd EEEE", Locale.getDefault())
        val dateString = dateFormat.format(currentTime)
        
        timeTextView.text = timeString
        dateTextView.text = dateString
    }
    
    override fun onDestroy() {
        super.onDestroy()
        timer?.cancel()
        timer = null
    }
}