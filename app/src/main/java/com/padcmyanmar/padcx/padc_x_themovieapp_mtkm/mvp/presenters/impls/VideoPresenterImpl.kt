package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.VideoPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.VideoView

class VideoPresenterImpl : VideoPresenter, AbstractBasePresenter<VideoView>() {
    var mPopularMovieModel: PopularMovieModel =
        PopularMovieModelImpl

    override fun onUiReady(lifecycleOwner: LifecycleOwner, movieId: Int) {
        mPopularMovieModel.getVideo(movieId,
            onSuccess = {
                mView?.showVideo(it[0].key.toString())
            })
    }
}