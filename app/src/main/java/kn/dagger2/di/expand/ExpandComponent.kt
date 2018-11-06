package kn.dagger2.di.expand

import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import kn.dagger2.HttpModule
import kn.dagger2.MainActivity
import javax.inject.Singleton

/**
 *    author : knX
 *    date   : 2018/11/6下午3:43
 *    desc   :
 */
@Singleton
@Component(modules = [HttpModule::class,AndroidInjectionModule::class])
interface ExpandComponent{
    fun injectMainActivity(mainActivity: MainActivity)
}