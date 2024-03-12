package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CrewVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.CreatorViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder

class CreatorAdapter: BaseMovieAdapter<BaseMovieViewHolder<CrewVO>, CrewVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseMovieViewHolder<CrewVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_creator,parent,false)
        return CreatorViewHolder(view)
    }
}