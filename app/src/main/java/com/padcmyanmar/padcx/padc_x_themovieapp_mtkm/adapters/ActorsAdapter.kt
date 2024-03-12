package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CastVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.ActorsViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder

class ActorsAdapter : BaseMovieAdapter<BaseMovieViewHolder<CastVO>,CastVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseMovieViewHolder<CastVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_actors,parent,false)
        return ActorsViewHolder(view)
    }
}