package cn.leancloud.demo.meizu_push;

import android.app.Application;
import cn.leancloud.AVLogger;
import cn.leancloud.AVMixPushManager;
import cn.leancloud.AVOSCloud;

/**
 * Created by fengjunwen on 2018/1/22.
 */

public class MyApp extends Application {
  private static final String LC_APP_ID = "";
  private static final String LC_APP_KEY = "";

  private static final String MEIZU_APP = "";
  private static final String MEIZU_KEY = "";

  @Override
  public void onCreate() {
    super.onCreate();
    AVOSCloud.setLogLevel(AVLogger.Level.DEBUG);
    AVOSCloud.initialize(this,LC_APP_ID,LC_APP_KEY);

    boolean registResult = AVMixPushManager.registerFlymePush(this, MEIZU_APP, MEIZU_KEY);
    System.out.println("register result;" + registResult);
  }
}
