package kn.dagger2.di.expand

import dagger.Subcomponent
import dagger.android.AndroidInjector
import kn.dagger2.ActivityScope
import kn.dagger2.MainActivity

/**
 *    author : knX
 *    date   : 2018/11/6下午3:45
 *    desc   :
 */
@ActivityScope
@Subcomponent
interface MainActivitySubComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}