package mongo;

import mongo.utils.MongoUtils;

/**
 * @author zhuangyq
 * @create 2018-06-01 下午 15:31
 **/
public class Test {

    public static void main(String[] args) {
        MongoUtils mongoUtils=new MongoUtils("192.168.2.188",27017);

        for(String s:mongoUtils.getAllCollections("mycol")){
            System.out.println(s);
        }
    }
}
