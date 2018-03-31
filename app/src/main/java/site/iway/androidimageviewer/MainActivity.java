package site.iway.androidimageviewer;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;

import site.iway.androidhelpers.AssetsHelper;
import site.iway.androidhelpers.ImageViewer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = AssetsHelper.readImageFile(this, "image.jpg");

        ImageViewer imageViewer = (ImageViewer) findViewById(R.id.imageViewer);
        imageViewer.setBitmap(bitmap);
    }

}
