package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_pod_empty.view.*

class EmptyViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {

    private lateinit var mDelegate: Delegate

    override fun onFinishInflate() {
        super.onFinishInflate()

        setUpListener()
    }

    fun setUpListener(){
        btn_empty.setOnClickListener{
            mDelegate.onTapTryAgian()
        }
    }

    fun setDelegate(delegate : Delegate){
        mDelegate=delegate
    }

    interface Delegate{
        fun onTapTryAgian()
    }
}