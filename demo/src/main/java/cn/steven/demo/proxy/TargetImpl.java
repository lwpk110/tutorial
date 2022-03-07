package cn.steven.demo.proxy;

public class TargetImpl implements Target {

    @Override
    public String execute(String name) {
        return String.format("hello:%s ==> 被代理实现类", name);
    }

    public Integer executeInt(int i){
        return i;
    }
}
