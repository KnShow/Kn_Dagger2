package kn.dagger2

/**
 *    author : knX
 *    e-mail : m15272056597@163.com
 *    date   : 2018/10/31下午5:26
 *    desc   :
 *    version: 1.0
 */
class UserModule{
    fun providerUser(): User {
        return User("")
    }
}