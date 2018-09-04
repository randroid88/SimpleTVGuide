package io.winf.simpletvguide

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Button

class MainFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val singleChannelButton = view.findViewById(R.id.single_channel_button) as Button
        singleChannelButton.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        TODO("not implemented")
    }

}