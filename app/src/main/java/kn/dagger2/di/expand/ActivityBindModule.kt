package kn.dagger2.di.expand

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import kn.dagger2.MainActivity

/**
 *    author : knX
 *    date   : 2018/11/6下午3:47
 *    desc   :
 */
@Module(subcomponents = [MainActivitySubComponent::class])
abstract class ActivityBindModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    /**
     * <out Activity>
     * 对应的是java中的协变
     * 在这里表示的是 Factory中的<obj> 是Activity的子类型
     */
    abstract fun bindAndroidInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}