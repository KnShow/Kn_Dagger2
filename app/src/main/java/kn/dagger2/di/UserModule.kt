package kn.dagger2.di

import dagger.Module
import dagger.Provides
import kn.dagger2.ActivityScope
import kn.dagger2.User

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/1下午3:23
 *    desc   :
 *    version: 1.0
 */
@Module
class   UserModule {
    @Provides
    @ActivityScope
    fun getUser(): User {
        return User("Kotlin")
    }
}