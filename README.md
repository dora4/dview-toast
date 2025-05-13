dview-toast
![Release](https://jitpack.io/v/dora4/dview-toast.svg)
--------------------------------

#### 卡片
![DORA视图 居中吐司](https://github.com/user-attachments/assets/c5508f89-57b5-46e2-82a4-3483f2dcbf98)

##### 卡名：Dora视图 Toast 
###### 卡片类型：效果怪兽
###### 属性：炎
###### 星级：2
###### 种族：龙族
###### 攻击力/防御力：800/1200
###### 效果：此卡不会因为对方卡的效果而破坏，并可使其无效化。此卡攻击里侧守备表示的怪兽时，若攻击力高于其守备力，则给予对方此卡原攻击力的伤害，并抽一张卡。此卡被战斗破坏送去墓地时，抽两张卡。

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
    implementation 'com.github.dora4:dora:1.2.29'
    implementation 'com.github.dora4:dview-toast:1.1'
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

#### 示例代码

https://github.com/dora4/dora_samples
