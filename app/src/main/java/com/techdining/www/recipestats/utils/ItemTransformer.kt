package com.techdining.www.recipestats.utils

import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager2.widget.ViewPager2
import com.techdining.www.recipestats.R

class ItemTransformer (private var progressValue: Float, private var itemPosition: Int) :
    ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        if (itemPosition % 2 == 0) {
            if (progressValue > 0) {
                page.findViewById<MotionLayout>(R.id.motion_layout_inner).progress = progressValue
                page.findViewById<MotionLayout>(R.id.motion_layout).progress = progressValue
            } else {
                page.findViewById<MotionLayout>(R.id.motion_layout_inner).progress = 0f
                page.findViewById<MotionLayout>(R.id.motion_layout).progress = 0f
            }
        } else {
            if (progressValue > 0) {
                page.findViewById<MotionLayout>(R.id.motion_layout_inner).progress = 1 - progressValue
                page.findViewById<MotionLayout>(R.id.motion_layout).progress = 1 - progressValue
            } else {
                page.findViewById<MotionLayout>(R.id.motion_layout_inner).progress = 1f
                page.findViewById<MotionLayout>(R.id.motion_layout).progress = 1f
            }
        }
    }
}