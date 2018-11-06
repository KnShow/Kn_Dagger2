package kn.dagger2

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/11/5上午10:46
 *    desc   : Kotlin自定义注解
 *    version: 1.0
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope()