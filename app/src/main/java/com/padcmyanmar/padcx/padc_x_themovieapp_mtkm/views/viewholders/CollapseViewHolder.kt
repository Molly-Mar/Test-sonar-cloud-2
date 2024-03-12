package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.TopRateVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.VideoViewDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_collapse.view.*

class CollapseViewHolder(itemView: View,delegate: VideoViewDelegate) : BaseMovieViewHolder<TopRateVO>(itemView) {

    init {
        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapMovieItem(it.id)
            }
        }
    }

    override fun bindData(data: TopRateVO) {
        mData=data
        mData.let {
            Glide
                .with(itemView)
                .load(IMAGE_BASE_URL + mData?.posterPath)
                .into(itemView.iv_collapse)

            itemView.tv_collapse_title.text = mData?.title
        }
    }
}