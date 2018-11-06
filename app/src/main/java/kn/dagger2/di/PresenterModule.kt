package kn.dagger2.di

import dagger.Module
import dagger.Provides
import kn.dagger2.ActivityScope
import kn.dagger2.Presenter
import javax.inject.Singleton

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/5上午11:07
 *    desc   :
 *    version: 1.0
 */
@Module
class PresenterModule {
    @Singleton
    @Provides
    fun providerPresenter(): Presenter {
        return Presenter()
    }
}