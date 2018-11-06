# Kn_Dagger2
Dagger2

dependencies:
 * 1.多个component之间的scope不能相同
 * 2.singleton组件不能依赖自定义scope，自定义scope可以依赖singleton
 * 3.没有scope的component不能依赖有scope的component，
 *   有scope的component是可以依赖没有scope的compnent;
 *    version: 1.0

 ActivityScope:
 1. 等同于Singleton,但是可以额外添加新的注解来标识具体使用场景或者用途
