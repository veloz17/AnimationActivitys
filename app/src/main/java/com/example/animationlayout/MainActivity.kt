package com.example.animationlayout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animationlayout.ProjetoKotlin.AnimationLayout

class MainActivity : AppCompatActivity() {

    companion object{

        val options = arrayOf(
            //0
            "animateZoom Sample",
            //1
            "animateFade Sample",
            //2
            "animateWindmill Sample",
            //3
            "animateSpin Sample",
            //4
            "animateDiagonal Sample",
            //5
            "animateSplit Sample",
            //6
            "animateShrink Sample",
            //7
            "animateCard Sample",
            //8
            "animateInAndOut Sample",
            //9
            "animateSwipeLeft Sample",
            //10
            "animateSwipeRight Sample",
            //11
            "animateSlideLeft Sample",
            //12
            "animateSlideRight Sample",
            //13
            "animateSlideDown Sample",
            //14
            "animateSlideUp Sample")
    }

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter()
    }

    private class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val holder = ItemViewHolder.newInstance(parent)


            holder.itemView.setOnClickListener {v: View? ->

                val context = holder.itemView.context

                when(holder.adapterPosition){

                    0 -> {
                        context.startActivity(Intent(context, ZoomActivity::class.java))
                        AnimationLayout.animateZoom(context)
                    }

                    1 -> {
                        context.startActivity(Intent(context, FadeActivity::class.java))
                        AnimationLayout.animateFade(context)
                    }
                    2->{
                        context.startActivity(Intent(context, WindmillActivity::class.java))
                        AnimationLayout.animateWindmill(context)
                    }
                    3->{
                        context.startActivity(Intent(context, SpinActivity::class.java))
                        AnimationLayout.animateSpin(context)
                    }
                    4->{
                        context.startActivity(Intent(context, DiagonalActivity::class.java))
                        AnimationLayout.animateDiagonal(context)
                    }
                    5->{
                        context.startActivity(Intent(context, SplitActivity::class.java))
                        AnimationLayout.animateSplit(context)
                    }
                    6->{
                        context.startActivity(Intent(context, ShrinkActivity::class.java))
                        AnimationLayout.animateShrink(context)
                    }
                    7->{
                        context.startActivity(Intent(context, CardActivity::class.java))
                        AnimationLayout.animateCard(context)
                    }
                    8->{
                        context.startActivity(Intent(context, InAndOutActivity::class.java))
                        AnimationLayout.animateInAndOut(context)
                    }
                    9->{
                        context.startActivity(Intent(context, SwipeLeftActivity::class.java))
                        AnimationLayout.animateSwipeLeft(context)
                    }
                    10->{
                        context.startActivity(Intent(context, SwipeRightActivity::class.java))
                        AnimationLayout.animateSwipeRight(context)
                    }

                    11->{
                        context.startActivity(Intent(context, SlideLeftActivity::class.java))
                        AnimationLayout.animateSlideLeft(context)
                    }
                    12->{
                        context.startActivity(Intent(context, SlideRightActivity::class.java))
                        AnimationLayout.animateSlideRight(context)
                    }
                    13->{
                        context.startActivity(Intent(context, SlideDownActivity::class.java))
                        AnimationLayout.animateSlideDown(context)
                    }
                    14->{
                        context.startActivity(Intent(context, SlideUpActivity::class.java))
                        AnimationLayout.animateSlideUp(context)
                    }

                    else -> context.startActivity(Intent(context, MainActivity::class.java))

                }
            }

            /*
            holder.itemView.setOnClickListener { v: View? ->

                val clazz: Class<*>

                clazz = when (holder.adapterPosition) {

                    0 -> ZoomActivity::class.java
                    1 -> FadeActivity::class.java
                    2 -> WindmillActivity::class.java
                    3 -> SpinActivity::class.java
                    4 -> DiagonalActivity::class.java
                    5 -> SplitActivity::class.java
                    6 -> ShrinkActivity::class.java
                    7 -> CardActivity::class.java
                    8 -> InAndOutActivity::class.java
                    9 -> SwipeLeftActivity::class.java
                    10 -> SwipeRightActivity::class.java
                    11 -> SlideLeftActivity::class.java
                    12 -> SlideRightActivity::class.java
                    13 -> SlideUpActivity::class.java
                    else -> MainActivity::class.java
                }
                val context = holder.itemView.context
                context.startActivity(Intent(context, clazz))
            }
            */

            return holder
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            holder.bind(options[position])
        }

        override fun getItemCount(): Int {
            return options.size
        }

    }

    private class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var mTextTitle: TextView

        companion object {
            fun newInstance(parent: ViewGroup): ItemViewHolder {
                return ItemViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_text, parent, false))
            }
        }

        init {
            mTextTitle = view.findViewById(R.id.title)
        }

        fun bind(title: String) {
            mTextTitle.text = title
        }
    }

}
