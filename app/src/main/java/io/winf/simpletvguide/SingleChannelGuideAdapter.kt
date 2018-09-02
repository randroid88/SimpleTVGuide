package io.winf.simpletvguide

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class SingleChannelGuideAdapter(private val programList: List<String>) :
        RecyclerView.Adapter<SingleChannelGuideAdapter.ProgramViewHolder>() {

    class ProgramViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): SingleChannelGuideAdapter.ProgramViewHolder {
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.program_text_view, parent, false) as TextView

        return ProgramViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        holder.textView.text = programList.get(position)
    }

    override fun getItemCount() = programList.size
}