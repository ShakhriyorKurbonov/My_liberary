package iqro.mobil.myliberary

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.myliberary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.addImg.setOnClickListener{
            Intent(this,AddbookActivity::class.java).apply {
                startActivity(this)
            }
        }

    binding.membersImg.setOnClickListener{
        Intent(this,MembersActivity::class.java).apply {
            startActivity(this)
        }
    }


    }
}