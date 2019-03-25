package cn.leancloud.demo.xiaomi_push;

import android.app.Application;

import com.avos.avoscloud.*;

/**
 * Created by fengjunwen on 2018/1/22.
 */

public class MyApp extends Application {
  // 请替换成您自己的 appId 和 appKey
  private static final String LC_APP_ID = "";
  private static final String LC_APP_KEY = "";

  // 请替换成您自己的小米 appId 和 appKey
  private static final String XIAOMI_APP = "";
  private static final String XIAOMI_KEY = "";

  @Override
  public void onCreate() {
    super.onCreate();
    AVOSCloud.setDebugLogEnabled(true);
    AVOSCloud.initialize(this,LC_APP_ID,LC_APP_KEY);
    AVMixPushManager.registerXiaomiPush(this, XIAOMI_APP, XIAOMI_KEY);
  }
}
