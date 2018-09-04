package io.winf.simpletvguide.singlechannel

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import io.winf.simpletvguide.R


class SingleChannelFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.single_channel_view, container, false)
        viewManager = LinearLayoutManager(context)
        viewAdapter = SingleChannelAdapter(getMockProgramList())

        recyclerView = view.findViewById<RecyclerView>(R.id.single_channel_guide_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }
        return view
    }

    private fun getMockProgramList(): List<String> {
        val programsArray = resources.getStringArray(R.array.mock_program_name_array)
        return programsArray.toList()
    }
}