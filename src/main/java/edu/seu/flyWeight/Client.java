package edu.seu.flyWeight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        Website website = factory.getWebsiteCategory("新闻");
        Website website1 = factory.getWebsiteCategory("新闻");
        // 外部状态，不可共享
        User user1 = new User("tom");
        User user2 = new User("jack");

        website.use(user1);
        website1.use(user2);
        System.out.println(website == website1);  // true
        System.out.println(factory.getWebSiteCount());  // 1
    }
}
