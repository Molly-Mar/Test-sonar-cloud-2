package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CastVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_actors.view.*

class ActorsViewHolder(itemView: View) : BaseMovieViewHolder<CastVO>(itemView) {
    override fun bindData(data: CastVO) {
        mData = data
        
        Glide
            .with(itemView)
            .load(IMAGE_BASE_URL+mData?.profilePath)
            .into(itemView.iv_actors)
        
        itemView.tv_actors_name.text=mData?.name
    }
}