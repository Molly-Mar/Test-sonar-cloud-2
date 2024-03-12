package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CastVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CrewVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DetailVO
import com.padcmyanmar.padcx.shared.mvp.view.BaseView


interface DetailView : BaseView {

    fun finishActivity()
    fun bindDetailData(movie : DetailVO)
    fun bindCastData(cast : List<CastVO>)
    fun bindCrewData(crew : List<CrewVO>)
}