package com.example.challenge4

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var sportsAdapter: SportsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val sportsList = getSportsList()
        sportsAdapter = SportsAdapter(sportsList)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = sportsAdapter
            setHasFixedSize(true)
        }
    }

    private fun getSportsList(): List<Sport> {
        return listOf(
            Sport("Baseball", "America's favorite pastime with bat and ball", R.drawable.baseball),
            Sport("Basketball", "Fast-paced indoor sport with hoops", R.drawable.basketball),
            Sport("Boxing", "Combat sport of strength and strategy", R.drawable.boxing),
            Sport("Cricket", "Gentleman's game played with bat and wickets", R.drawable.cricket),
            Sport("Football", "Popular sport played with oval ball", R.drawable.football),
            Sport("Golf", "Precision sport played on beautiful courses", R.drawable.golf),
            Sport("Hockey", "Fast-paced ice sport with sticks and puck", R.drawable.hockey),
            Sport("Swimming", "Full body workout in the water", R.drawable.swim)
        )
    }
}