package com.study.rocky.factory.simple_factory.car;

import android.util.Log;

import com.study.rocky.factory.simple_factory.IObject;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class CarObj implements IObject {
    @Override
    public void show() {
        Log.d("CarObj", "汽车会跑");
    }
}
