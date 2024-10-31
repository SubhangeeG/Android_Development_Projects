package com.example.portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UnsafeIntentLaunch")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        fetching clicks of education button
        val btnedus = findViewById<Button>(R.id.btnedu)
        btnedus.setOnClickListener{
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        val btnskill = findViewById<Button>(R.id.btnskills)
        btnskill.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val btnachs = findViewById<Button>(R.id.btnach)
        btnachs.setOnClickListener{
            intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }
        val btnpros = findViewById<Button>(R.id.btnpro)
        btnpros.setOnClickListener{
            intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }
    }
}