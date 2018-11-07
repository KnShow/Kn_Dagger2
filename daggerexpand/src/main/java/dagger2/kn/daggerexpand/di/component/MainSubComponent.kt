package dagger2.kn.daggerexpand.di.component

import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger2.kn.daggerexpand.MainActivity

/**
 *    author : knX
 *    date   : 2018/11/7下午2:06
 *    desc   :
 */
@Subcomponent(modules = [AndroidInjectionModule::class])
interface MainSubComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    public abstract class Builder: AndroidInjector.Builder<MainActivity>() {

    }
}