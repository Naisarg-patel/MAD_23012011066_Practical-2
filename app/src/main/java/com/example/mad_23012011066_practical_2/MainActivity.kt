package com.example.mad_23012011066_practical_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showmsg("onCreate method is called")
    }
    fun showmsg(msg:String) {
        Log.i(TAG, "ShowMassage:$msg")
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()
    }
    override fun onStart(){
        showmsg("onStart method is called")
        super.onStart()
    }
    override fun onResume(){
        showmsg("onResume method is called")
        super.onResume()
    }
    override fun onPause(){
        showmsg("onPause method is called")
        super.onPause()
    }
    override fun onStop(){
        showmsg("onStop method is called")
        super.onStop()
    }
    override fun onRestart(){
        showmsg("onrestart method is called")
        super.onRestart()
    }
    override fun onDestroy(){
        showmsg("onDestroy method is called")
        super.onDestroy()
    }

}
