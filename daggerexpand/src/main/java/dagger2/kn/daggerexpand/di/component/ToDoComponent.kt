package dagger2.kn.daggerexpand.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.DaggerApplication
import dagger2.kn.daggerexpand.ToDoApplication

/**
 *    author : knX
 *    date   : 2018/11/7下午2:02
 *    desc   :
 */
@Component(modules = [AndroidInjectionModule::class])
interface ToDoComponent {
    fun injectApplication(application: ToDoApplication)
}