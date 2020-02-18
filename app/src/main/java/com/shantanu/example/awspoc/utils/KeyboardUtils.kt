package com.shantanu.example.awspoc.utils

import android.content.Context.INPUT_METHOD_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.widget.EditText
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


class KeyboardUtils {

    fun hideSoftKeyboard(activity: Activity) {
        val view = activity.window.peekDecorView()
        if (view != null) {
            val inputmanger = activity
                .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputmanger.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun hideSoftKeyboard(context: Context, view: View) {
        view.clearFocus()
        val inputmanger = context
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputmanger.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }

    fun showSoftKeyboard(activity: Activity) {
        showSoftKeyboard(activity, null!!)
    }

    fun showSoftKeyboard(context: Context, view: View) {
        view.setFocusable(true)
        view.setFocusableInTouchMode(true)
        view.requestFocus()
        val inputManager = context
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.showSoftInput(view, 0)
    }

    fun toggleKeyboradState(context: Context, edit: EditText) {
        edit.isFocusable = true
        edit.isFocusableInTouchMode = true
        edit.requestFocus()
        val inputManager = context
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
    }


   /* fun Fragment.hideKeyboard() {
        view?.let { activity?.hideKeyboard(it) }
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
*/
}