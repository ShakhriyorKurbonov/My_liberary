package iqro.mobil.myliberary

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.myliberary.databinding.MembersBinding

class MembersActivity : AppCompatActivity() {
    private lateinit var binding:MembersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   binding=MembersBinding.inflate(layoutInflater)
        setContentView(binding.root)

  binding.view32.setOnClickListener{
      Intent(this,MemberInfo::class.java).apply {
          startActivity(this)
      }
  }
        binding.backImg1.setOnClickListener {
            onBackPressed()
        }

    }
}