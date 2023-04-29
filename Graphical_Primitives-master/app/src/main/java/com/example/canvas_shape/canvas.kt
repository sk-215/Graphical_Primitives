package com.example.canvas_shape

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class canvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint : Paint= Paint()
        paint.setColor(Color.YELLOW)
        canvas?.drawPaint(paint)

        paint.setColor(Color.BLUE)
        paint.textSize=50f
        canvas?.drawLine(520f,850f,520f,1150f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawText("LINE", 510f, 830f, paint)
        paint.setColor(Color.WHITE)
        paint.textSize=60f
        canvas?.drawCircle(200f,350f,150f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawText("CIRCLE", 130f, 180f, paint)


        paint.setColor(Color.RED)
        paint.textSize=60f
        canvas?.drawRect(50f,850f,350f,1150f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawText("RECTANGLE", 420f, 140f, paint)

        paint.setColor(Color.MAGENTA)
        paint.textSize=60f
        canvas?.drawRect(400f,150f,650f,700f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawText("SQUARE", 120f, 800f, paint)


        paint.setColor(Color.GREEN)
        paint.textSize=60f
        canvas?.drawOval(500f,1750f,800f,1200f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawText("OVAL", 825f, 1500f, paint)

    }
}