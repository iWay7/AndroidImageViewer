# AndroidImageViewer
Android 单张图片查看器。支持拖动，双击放大，双指缩放。


### 本应用的示例

![image](https://github.com/iWay7/AndroidImageViewer/blob/master/sample.gif)   

### 简单的集成方式

#### 第一步：在你的项目 build.gradle 添加 maven 库：
```
allprojects {
    repositories {
        ...
        maven { url 'https://www.jitpack.io' }
    }
}
```

#### 第二步：在你的模块 build.gradle 添加依赖库：
```
dependencies {
    ...
    api 'com.github.iWay7:AndroidHelpers:1.0.4'
}
```

#### 然后就可以开心的使用啦：
##### 在布局文件中声明一个 ImageViewer 视图：
```
<site.iway.androidhelpers.ImageViewer
    android:id="@+id/imageViewer"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

##### 给这个 ImageViewer 设置一张图片就可以啦：
```
ImageViewer imageViewer = (ImageViewer) findViewById(R.id.imageViewer);
imageViewer.setBitmap(bitmap);
```

##### 目前 ImageViewer 支持的配置包括：
```
imageViewer.setBitmap(...); // 设置对应的图片
imageViewer.setClickDetectRadius(...); // 设置点击识别半径
imageViewer.setClickDetectStep(...); // 设置点击识别时间间隔，默认为 300 毫秒
imageViewer.setImageAnimationStep(...); // 设置动画帧间隔
imageViewer.setInitScaleType(...); // 设置初始缩放模式
imageViewer.setMaxImageScale(...); // 设置图片最大的放大倍数
imageViewer.setMinImageScaleMin(...); // 设置图片最小的放大倍数
imageViewer.setMultiSamplingEnabled(...);  // 设置是否开启多重采样（抗锯齿）
imageViewer.setOnClickListener(...); // 设置点击的回调
```