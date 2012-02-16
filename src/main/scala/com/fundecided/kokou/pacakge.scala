package com.fundecided
package object kokou {
  import android.view.View
  implicit def onClickConversion(view: View) = new ViewWithOnClick(view)

  class ViewWithOnClick(view: View) {
    def onClick(action: View => Any): Unit = {
      view.setOnClickListener(new View.OnClickListener() {
        def onClick(v: View) { action(v) }
      })
    }
    def onClick(action: => Any): Unit = onClick((v: View) => { action })
  }
}

