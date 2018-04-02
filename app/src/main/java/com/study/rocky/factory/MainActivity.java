package com.study.rocky.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.baidu.mapapi.map.MapView;
import com.study.rocky.factory.simple_factory.IFactory;
import com.study.rocky.factory.simple_factory.IObject;
import com.study.rocky.factory.simple_factory.car.CarFac;
import com.study.rocky.factory.simple_factory.imp.plain.PlainFac;
import com.study.rocky.factory.simple_factory_map.map.IMapFactory;
import com.study.rocky.factory.simple_factory_map.map.IMapView;
import com.study.rocky.factory.simple_factory_map.map.baidu.BaiDuMapFactory;

public class MainActivity extends AppCompatActivity {

    private IMapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IFactory factory = new CarFac();
//        IObject car = factory.createObj();
//        car.show();
//        IFactory factory = new PlainFac();
//        IObject plain = factory.createObj();
//        plain.show();
//
//        //这样写的目的很显然  当我们要切换不同控件的时候  实现代码基本不变  以上为工厂方法模式 也是 简单工厂模式
//


        //案例二 是 切换地图实际场景模拟

        //测试百度

        FrameLayout fl_main = findViewById(R.id.fl_main);
        //来个工厂
        IMapFactory factory = new BaiDuMapFactory(this);
        //创建地图
        mapView = factory.getMapView();
        fl_main.addView(mapView.getView());

        //同步生命周期


        //同理  测试 高德地图
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        // activity 暂停时同时暂停地图控件
        mapView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // activity 恢复时同时恢复地图控件
        mapView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // activity 销毁时同时销毁地图控件
        MapView.setMapCustomEnable(false);
        mapView.onDestroy();
    }
}
