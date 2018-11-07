# Kn_Dagger2
Dagger2

## dependencies:
 * 1.多个component之间的scope不能相同
 * 2.singleton组件不能依赖自定义scope，自定义scope可以依赖singleton
 * 3.没有scope的component不能依赖有scope的component，
 *   有scope的component是可以依赖没有scope的compnent;
 *    version: 1.0

 ActivityScope:
 1. 等同于Singleton,但是可以额外添加新的注解来标识具体使用场景或者用途


## Dagger2 扩展库的使用 -> Dagger_Expand
### 接入方式
    //    dagger.android 扩展
        compile "com.google.dagger:dagger-android:2.1"
        compile "com.google.dagger:dagger-android-support:2.11"
        kapt "com.google.dagger:dagger-android-processor:2.11"
        apply plugin: 'kotlin-kapt'
        apply plugin: 'kotlin-android'


### 核心类
      AndroidInjection：注入Android核心库的基本类型的实例
      AndroidInjector<T>:注入Android库的类型的接口, T为Android库的基本类型T,比如Activity、Fragment、BroadcastReceive等；
      AndroidInjector.Factory<T>：AndroidInjector<T>的工厂类接口
      DispatchingAndroidInjector<T>:其为AndroidInjector<T>接口的实现类，将Android核心库的的基本类型T的实例注入Dagger，该操作是由Android核心库的类的实例本身执行，而不是Dagger。


## Dagger2 注入原理
       //示例代码
       DaggerAppComPonent.builder()
                       .build()
                       .userModule(Module())
                       .injectMainActivity(this)

### 使用了标准的建造者模式类构建对象，,返回自己
    public static Builder builder() {
     return new Builder();
    }
    Builder类中可以设置自己的 Component、Module

### 再看 AppComponent的build方法 我们没设置的话就创建了一个我们定义的Module赋值给Builder的成员变量
     if (userModule == null) {
             this.userModule = new UserModule();
     }
     if (presenterComponent == null) {
             throw new IllegalStateException(
                 PresenterComponent.class.getCanonicalName() + " must be set");
           }
     return new DaggerAppComPonent(this);
   * 创建了Module 和一个DaggerAppComPonent
   * Module 为什么提供需要注入到组件中的对象
   * DaggerAppComponent构造方法中的实现

我们来看一下

    this.getUserProvider =
        DoubleCheck.provider(UserModule_GetUserFactory.create(builder.userModule));

    this.providerPresenterProvider =
        new kn_dagger2_di_PresenterComponent_providerPresenter(builder.presenterComponent);

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(getUserProvider, providerPresenterProvider);

    this.secActivityMembersInjector =
        SecActivity_MembersInjector.create(getUserProvider, providerPresenterProvider);

   UserModule_GetUserFactory.create() 中返回一个Factory:Provider()对象,并且拥有一个Module的成员变量
