Aim:Create an Android Application to demonstrate the functions of Activity Life Cycle and Basic UI.

Problem Statement:
 
Create an Activity that displays “Hello World” in the center of the screen.
Background of the layout should be yellow (#FFFF00).
TextView properties:
Text color: Holo Blue (@android:color/holo_blue_bright)
Font size: 27sp
Style: Bold & Italic
Demonstrate the Activity Life Cycle using:
Log messages
Toast messages
Snackbar messages
All Activity Life Cycle methods should be printed in Logcat.

program:

Activity_Main.xml:

<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFEB3B"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textColor="#03A9F4"
        android:textSize="27sp"
        android:textStyle="bold|italic"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

MainActivity.kt:

package com.example.mad_23012011066_practical_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMsg("onCreate method is called")
    }

    fun showMsg(msg: String) {
        Log.i(TAG, "ShowMessage: $msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        showMsg("onStart method is called")
        super.onStart()
    }

    override fun onResume() {
        showMsg("onResume method is called")
        super.onResume()
    }

    override fun onPause() {
        showMsg("onPause method is called")
        super.onPause()
    }

    override fun onStop() {
        showMsg("onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        showMsg("onRestart method is called")
        super.onRestart()
    }

    override fun onDestroy() {
        showMsg("onDestroy method is called")
        super.onDestroy()
    }
}

Output:
Displays Hello World in the center with yellow background.
Logs, Toasts, and Snackbar messages show Activity Life Cycle stages:
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()

