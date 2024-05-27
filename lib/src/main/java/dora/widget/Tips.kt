@file:JvmName("Tips")

package dora.widget

import android.app.Application
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import dora.widget.toast.R
import dora.widget.toast.databinding.WidgetTipsToastBinding

object Tips {

    private var toast: Toast? = null

    private lateinit var context: Application

    private val handler = Looper.myLooper()?.let { Handler(it) }

    private val binding by lazy {
        WidgetTipsToastBinding.inflate(LayoutInflater.from(context), null, false)
    }

    /**
     * 可使用dora框架的配置自动注入。
     */
    fun init(context: Application) {
        this.context = context
    }

    fun show(@StringRes resId: Int) {
        val msg = context.getString(resId)
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT
        )
    }

    fun show(msg: String?) {
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT
        )
    }

    fun show(msg: String?, duration: Int) {
        showTipsImpl(msg, duration)
    }

    fun show(@StringRes resId: Int, duration: Int) {
        val msg = context.getString(resId)
        showTipsImpl(msg, duration)
    }

    fun showSuccess(msg: String?) {
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT,
            R.drawable.ic_toast_success
        )
    }

    fun showSuccess(@StringRes resId: Int) {
        val msg = context.getString(resId)
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT,
            R.drawable.ic_toast_success
        )
    }

    fun showWarning(msg: String?) {
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT,
            R.drawable.ic_toast_warning
        )
    }

    fun showWarning(@StringRes resId: Int) {
        val msg = context.getString(resId)
        showTipsImpl(
            msg,
            Toast.LENGTH_SHORT,
            R.drawable.ic_toast_warning
        )
    }

    private fun showTipsImpl(
        msg: String?,
        duration: Int,
        @DrawableRes resId: Int = 0,
    ) {
        if (msg.isNullOrEmpty()) {
            return
        }
        toast?.let {
            cancel()
            toast = null
        }
        handler?.postDelayed({
            try {
                toast = Toast(context)
                toast?.view = binding.root
                binding.tipToastTxt.text = msg
                binding.tipToastTxt.setCompoundDrawablesWithIntrinsicBounds(
                    resId,
                    0,
                    0,
                    0
                )
                toast?.setGravity(Gravity.CENTER, 0, 0)
                toast?.duration = duration
                toast?.show()
            } catch (e: Exception) {
                Log.e("show tips error", "$e")
            }
        }, 50)
    }

    fun cancel() {
        toast?.cancel()
        handler?.removeCallbacksAndMessages(null)
    }
}