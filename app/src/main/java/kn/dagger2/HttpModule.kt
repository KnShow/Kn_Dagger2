package kn.dagger2

import dagger.Module
import dagger.Provides

/**
 *    author : knX
 *    date   : 2018/11/6下午2:25
 *    desc   :
 */
@Module
class HttpModule{
    @Provides
    @ActivityScope
    fun providerHttpObject() = HttpObject()
}