dview-toast
![Release](https://jitpack.io/v/dora4/dview-toast.svg)
--------------------------------

#### Gradle依赖配置

```groovy
// 添加以下代码到项目根目录下的build.gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
// 添加以下代码到app模块的build.gradle
dependencies {
    // 需要依赖dora框架进行配置的注入
    implementation 'com.github.dora4:dora:1.2.4'
    implementation 'com.github.dora4:dview-toast:1.0'
}
```

#### Gradle依赖配置
```xml
<application>
        <!-- Dora生命周期注入的配置 -->
        <meta-data
            android:name="dora.lifecycle.config.TipsGlobalConfig"
            android:value="GlobalConfig"/>
</application>
```