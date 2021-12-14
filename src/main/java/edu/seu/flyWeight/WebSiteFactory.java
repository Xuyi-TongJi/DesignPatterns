package edu.seu.flyWeight;

import edu.seu.flyWeight.concrete.ConcreteWebsite;

import java.util.HashMap;

// flyweightFactory
// 根据需求返回一个具体的网站
public class WebSiteFactory {

    // 集合，充当池的作用
    // 池：体现了享元的思想（线程池，连接池）
    private HashMap<String, Website> pool = new HashMap<>();

    // 根据网站的额理性，返回一个网站，如果没有就创建一个网站，并放入池中
    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
            return (Website) pool.get(type);
        }
        return (Website) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
