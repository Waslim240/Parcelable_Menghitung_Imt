package binar.andlima.latihanimt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bmi = intent.getParcelableExtra<DataImt>("hasil") as DataImt

        val tinggiBadan = bmi.tinggi_badan / 100
        val hitungImt = bmi.berat_badan / (tinggiBadan * tinggiBadan)

        var hasil = ""
        if (hitungImt <= 18.4 ){
            hasil = "Kurus"
        } else if (hitungImt >= 18.5 && hitungImt <= 24.9) {
            hasil = "Normal"
        } else if (hitungImt >= 25 && hitungImt <= 29.9){
            hasil = "Overweight"
        } else {
            hasil = "Obesitas"
        }

        hasilnya.text = "BB = ${bmi.berat_badan}\nTB = ${bmi.tinggi_badan}\n\nHasil Imt\n$hasil"


    }
}