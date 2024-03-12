package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CastVO

fun getDummyCastData() : List<CastVO>{
    var data1 = CastVO()
    var data2 = CastVO()
    return arrayListOf(data1,data2)
}