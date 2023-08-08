package com.example.portofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SD Negeri Tugu 1", "Jl. Tugu Merdeka, Pangkalan, Tugu, Kec.Sayung, Kab.Demak, Jawa Tengah 59563"))
        list.add(SchoolData("SMP Negeri 2 Sayung", "Jl. Raya Sayung (Di Onggorawe) Daleman, Loireng, Kec.Sayung, Kab.Demak, Jawa Tengah 59563"))
        list.add(SchoolData("SMK Negeri 1 Sayung", "Jl. Raya Semarang-Demak, KM 14, Desa Loireng, Kecamatan Sayung, Kabupaten Demak, Provinsi Jawa Tengah"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }

}