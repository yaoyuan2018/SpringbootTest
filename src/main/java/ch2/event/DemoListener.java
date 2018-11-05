package ch2.event;

import org.springframework.context.ApplicationListener;

public class DemoListener implements ApplicationListener<DemoEvent> {
//实现ApplicationListener接口，并指定监听的事件类型。

    public void onApplicationEvent(DemoEvent demoEvent) {//使用onApplicationEvent方法对消息进行接受处理。
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
