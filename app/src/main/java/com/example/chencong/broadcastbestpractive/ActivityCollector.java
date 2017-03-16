package com.example.chencong.broadcastbestpractive;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencong on 2017/3/16.
 */
public class ActivityCollector {
    /**
     * 创建一个Activity类来管理所有的活动
     */

    public static List<Activity> activities = new ArrayList<Activity>();

    /**
     * 定义泛型数组activities 添加activity活动的方法addActivity
     * @param activity
     */
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     * 移除activity活动的方法removeActivity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 遍历所有活动将其停止完成
     */
    public static void findAll(){
        for (Activity activity: activities) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
