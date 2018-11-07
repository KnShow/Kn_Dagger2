package dagger2.kn.daggerexpand.di.module

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import dagger2.kn.daggerexpand.MainActivity
import dagger2.kn.daggerexpand.di.component.MainSubComponent

/**
 *    author : knX
 *    date   : 2018/11/7下午2:34
 *    desc   :
 */
@Module(subcomponents = [MainSubComponent::class])
abstract class MainModule {
    /**
     *  泛型中的通配符
     * <out Activity> -> <? extends Activity>
     */
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindYourActivityInjectFactory(builder: MainSubComponent.Builder): AndroidInjector.Factory<out Activity>
}