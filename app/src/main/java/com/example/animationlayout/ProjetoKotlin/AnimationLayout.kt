package com.example.animationlayout.ProjetoKotlin

import android.app.Activity
import android.content.Context
import com.example.animationlayout.R

object AnimationLayout {

    //0
    fun animateZoom(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_zoom_enter, R.anim.animate_zoom_exit)
    }
    //1
    fun animateFade(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_fade_enter, R.anim.animate_fade_exit)
    }
    //2
    fun animateWindmill(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_windmill_enter, R.anim.animate_windmill_exit)
    }
    //3
    fun animateSpin(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_spin_enter, R.anim.animate_spin_exit)
    }
    //4
    fun animateDiagonal(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_diagonal_right_enter, R.anim.animate_diagonal_right_exit)
    }
    //5
    fun animateSplit(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_split_enter, R.anim.animate_split_exit)
    }
    //6
    fun animateShrink(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_shrink_enter, R.anim.animate_shrink_exit)
    }
    //7
    fun animateCard(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_card_enter, R.anim.animate_card_exit)
    }
    //8
    fun animateInAndOut(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_in_out_enter, R.anim.animate_in_out_exit)
    }
    //9
    fun animateSwipeLeft(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_swipe_left_enter, R.anim.animate_swipe_left_exit)
    }
    //10
    fun animateSwipeRight(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_swipe_right_enter, R.anim.animate_swipe_right_exit)
    }
    //11
    fun animateSlideLeft(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_slide_left_enter, R.anim.animate_slide_left_exit)
    }
    //12
    fun animateSlideRight(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_slide_in_left, R.anim.animate_slide_out_right)
    }
    //13
    fun animateSlideDown(context: Context?) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_slide_down_enter, R.anim.animate_slide_down_exit)
    }
    //14
    fun animateSlideUp(context: Context) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_slide_up_enter, R.anim.animate_slide_up_exit)
    }

}