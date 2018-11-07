package kn.dagger2

import android.app.Application
import kn.dagger2.di.*

/**
 *    author : knX
 *    date   : 2018/11/5下午4:09
 *    desc   :
 */
class MyApp : Application() {
    companion object {
        var appComPonent: AppComPonent? = null

    }

    override fun onCreate() {
        super.onCreate()
//        appComPonent = Dagg.builder()
//                .presenterComponent(DaggerPresenterComponent.create())
//                .build()
    }

}