package kn.dagger2.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import kn.dagger2.ActivityScope
import kn.dagger2.HttpModule
import kn.dagger2.MainActivity
import kn.dagger2.SecActivity

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/1下午3:28
 *    desc   :
 * dependencies:
 * 1.多个component之间的scope不能相同
 * 2.singleton组件不能依赖自定义scope，自定义scope可以依赖singleton
 * 3.没有scope的component不能依赖有scope的component，
 *   有scope的component是可以依赖没有scope的compnent;
 *    version: 1.0
 */
@Component(modules = arrayOf(UserModule::class,HttpModule::class,AndroidInjectionModule::class), dependencies = [PresenterComponent::class])
@ActivityScope
interface AppComPonent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun injectSecActivity(secActivity: SecActivity)
}