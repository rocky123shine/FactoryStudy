package com.study.rocky.factory.simple_factory.imp.plain;

import com.study.rocky.factory.simple_factory.IFactory;
import com.study.rocky.factory.simple_factory.IObject;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class PlainFac implements IFactory {
    @Override
    public IObject createObj() {
        return new PlainObj();
    }
}
