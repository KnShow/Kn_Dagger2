package kn.dagger2.di

import dagger.Component
import kn.dagger2.Presenter
import javax.inject.Singleton

/**
 *    author : knX
 *    date   : 2018/11/6下午2:00
 *    desc   :
 */
@Singleton
@Component(modules = [PresenterModule::class])
interface PresenterComponent {
    fun providerPresenter() = Presenter()
}