package kn.dagger2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/1下午3:22
 *    desc   :
 *    version: 1.0
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var user: User
    @Inject
    lateinit var presenter: Presenter

    companion object {
        const val LOG = "jett"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApp.appComPonent!!.injectMainActivity(this)
        println(LOG + user.hashCode())
        println(LOG + "presenter:" + presenter.hashCode())
        initView();
    }

    private fun initView() {
        secActivity.setOnClickListener { toSecActivity() }
    }

    private fun toSecActivity() {
        val intent = Intent(this, SecActivity::class.java)
        startActivity(intent)
    }


}