package com.example.portofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(
            PortofolioData(
            R.drawable.web, "Link Github",
            "List Project di Github", "https://github.com/Setyanengrahayu/"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Web",
            "Project Latihan LKS bidang Web", "https://github.com/Setyanengrahayu/ci_4setya"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android, "LKS Andoid",
            "Project Latihan LKS bidang Android", "https://github.com/Setyanengrahayu/Teacher-Profile"
        ))

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter


    }
}