package iqro.mobil.myliberary

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.myliberary.databinding.LoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createAccImg.setOnClickListener {
            Intent(this,CreateAccount::class.java).apply {
                startActivity(this)
            }
    }

        binding.button.setOnClickListener {
            Intent(this,MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}