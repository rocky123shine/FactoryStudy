package com.study.rocky.factory.simple_factory.imp.plain;

import android.util.Log;

import com.study.rocky.factory.simple_factory.IObject;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class PlainObj implements IObject {
    @Override
    public void show() {
        Log.d("PlainObj", "飞机会飞");
    }
}
