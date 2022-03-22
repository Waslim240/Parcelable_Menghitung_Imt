package binar.andlima.latihanimt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hitung.setOnClickListener {
            val beratBadan = masukan_berat.text.toString().toDouble()
            val tinggi = masukan_tinggi.text.toString().toDouble()

            val pindah = Intent(this, MainActivity2::class.java)

            val bmi = DataImt(beratBadan, tinggi)
            pindah.putExtra("hasil", bmi)
            startActivity(pindah)
        }
    }
}