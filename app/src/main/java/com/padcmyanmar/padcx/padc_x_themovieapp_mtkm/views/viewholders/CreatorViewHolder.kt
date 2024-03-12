package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CrewVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_creator.view.*

class CreatorViewHolder(itemView: View) : BaseMovieViewHolder<CrewVO>(itemView) {
    override fun bindData(data: CrewVO) {
        mData=data
        Glide
            .with(itemView)
            .load(IMAGE_BASE_URL+mData?.profilePath)
            .into(itemView.iv_creator)

        itemView.tv_creator_name.text=mData?.name
    }
}