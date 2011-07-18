package com.tupshin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import R._

class Main extends Activity {
override def onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
                
        val textView = findViewById(R.id.text).asInstanceOf[TextView]
        val button = findViewById(R.id.button).asInstanceOf[Button]
                
        button.setOnClickListener((v: View) => textView.setText("Hello Scala2"))
}

implicit def func2OnClickListener(func : (View) => Unit) : View.OnClickListener = {
        return new View.OnClickListener() {
                override def onClick(v: View) = func(v)
        }
}
}