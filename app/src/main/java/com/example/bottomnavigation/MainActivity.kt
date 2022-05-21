package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottonNavigationView:BottomNavigationView = findViewById(androidx.coordinatorlayout.R.id.bottom)

        bottonNavigationView.setOnNavigationItemReselectedListener(BottomNavigationView.OnNavigationItemReselectedListener {

            when(it.itemId)
            {
                R.id.back-> Toast.makeText(applicationContext,"Back Button Selected..",Toast.LENGTH_LONG).show()

                R.id.app->Toast.makeText(applicationContext,"App Button Selected..",Toast.LENGTH_LONG).show()

                R.id.next->Toast.makeText(applicationContext,"Next Bottom Selected..",Toast.LENGTH_LONG).show()
            }
            true
        })
        }
    }