# AndroidImageViewer
Android 单张图片查看器。支持拖动，双击放大，双指缩放。


### 本应用的示例

![image](https://github.com/iWay7/AndroidImageViewer/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
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