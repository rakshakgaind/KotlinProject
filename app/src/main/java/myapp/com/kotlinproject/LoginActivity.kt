package myapp.com.kotlinproject

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

fun  Activity.toast(message: CharSequence, duration:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,duration).show()
}

class LoginActivity : AppCompatActivity() {
    var username: String = ""
    var password: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_LOGIN.setOnClickListener {
            username = et_username.text.toString()
            password = et_password.text.toString()
           toast( "username is ${username}")
            val loginIntent = Intent(this@LoginActivity,HomeActivity::class.java)
            startActivity(loginIntent)

        }
    }

}
