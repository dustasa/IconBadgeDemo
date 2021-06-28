应用气泡图标适配：

```java
 // 发送广播Intent 的名称
 private final String ACTION_NAME = "launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM"；

 // 发送1条通知，气泡显示+1
      Intent mIntent = new Intent(ACTION_NAME);
      mIntent.putExtra("packageName",getPackageName()); // 传入包名
      mIntent.putExtra("className",className); // 传入主活动类名
      mIntent.putExtra("notification",1); // 通知条数
      mIntent.putExtra("notificationBadgeState","ON"); // 通知气泡是否显示，“ON”：显示
      sendBroadcast(mIntent);

 // 发送1000条通知，气泡显示999+
      Intent mIntent = new Intent(ACTION_NAME);
      mIntent.putExtra("packageName",getPackageName()); // 传入包名
      mIntent.putExtra("className",className); // 传入主活动类名
      mIntent.putExtra("notification",1000); // 通知条数
      mIntent.putExtra("notificationBadgeState","ON"); // 通知气泡是否显示，“ON”：显示
      sendBroadcast(mIntent); 

// 通知清零，气泡清零且不再显示
      Intent mIntent = new Intent(ACTION_NAME);
      mIntent.putExtra("packageName",getPackageName()); // 传入包名
      mIntent.putExtra("className",className); // 传入主活动类名
      mIntent.putExtra("notificationBadgeState","OFF"); // 通知气泡是否显示，“OFF”：清零
      sendBroadcast(mIntent); 
```

