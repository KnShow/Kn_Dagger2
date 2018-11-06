package kn.dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/5上午10:24
 *    desc   :
 *    version: 1.0
 */
class SecActivity : AppCompatActivity() {
    @Inject
    lateinit var user: User
    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApp.appComPonent!!.injectSecActivity(this)
        println("jett" + user.hashCode())
        println("jett presenter: " + presenter.hashCode())
    }
}