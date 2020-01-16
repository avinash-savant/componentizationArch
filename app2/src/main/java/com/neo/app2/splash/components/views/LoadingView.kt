package com.neo.app2.splash.components.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.neo.app2.R
import com.neo.app2.splash.UserActionEvent
import com.netflix.componentizationV1.UIView

class LoadingView(container: ViewGroup) : UIView<UserActionEvent>(container) {
    private val view: View =
            LayoutInflater.from(container.context).inflate(R.layout.view_loading, container, true)
                    .findViewById(R.id.loading_progression)

    override val containerId: Int = view.id

    fun setStatusMessage(message: String) {
        view.findViewById<TextView>(R.id.status).text = message
    }

    override fun show() {
        view.visibility = View.VISIBLE
    }

    override fun hide() {
        view.visibility = View.GONE
    }
}
