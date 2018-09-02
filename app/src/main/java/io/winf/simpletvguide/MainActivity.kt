package io.winf.simpletvguide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = SingleChannelGuideAdapter(getMockProgramList())

        recyclerView = findViewById<RecyclerView>(R.id.single_channel_guide_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun getMockProgramList(): List<String> {
        val programsArray = resources.getStringArray(R.array.mock_program_name_array)
        return programsArray.toList()
    }
}
