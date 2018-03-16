package com.wind.designpattern_observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JiaoLongAmryControlCenter jiaoLongAmryControlCenter=new JiaoLongAmryControlCenter("蛟龙");
        ConcreteObserver concreteObserver1=new ConcreteObserver("红龙");
        jiaoLongAmryControlCenter.addAmry(concreteObserver1);
        ConcreteObserver concreteObserver2=new ConcreteObserver("黑龙");
        jiaoLongAmryControlCenter.addAmry(concreteObserver2);
        ConcreteObserver concreteObserver3=new ConcreteObserver("豹龙");
        jiaoLongAmryControlCenter.addAmry(concreteObserver3);
        ConcreteObserver concreteObserver4=new ConcreteObserver("天龙");
        jiaoLongAmryControlCenter.addAmry(concreteObserver4);

        concreteObserver4.beAttached(jiaoLongAmryControlCenter);

        jiaoLongAmryControlCenter.quitAmry(concreteObserver1);
        concreteObserver4.beAttached(jiaoLongAmryControlCenter);
    }
}
