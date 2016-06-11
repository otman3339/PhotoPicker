package cc.dagger.photopicker.loader;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧 Github地址：https://github.com/jeasonlzy0216
 * 版    本：1.0
 * 创建日期：2016/5/19
 * 描    述：ImageLoader抽象类，外部需要实现这个类去加载图片， 尽力减少对第三方库的依赖，所以这么干了
 * 修订历史：
 * ================================================
 */
public abstract class ImageLoader<GV extends ImageView, PV extends ImageView> {

    public abstract void displayImage(Activity activity, String path, ImageView imageView, int width, int height);

    public abstract void clearMemoryCache();

    public abstract GV onCreateGridItemView(Context mCxt);
}