package com.fsn.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fsn.modle.UserInfo;
import com.fsn.modle.WsOrder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class TestJSONArray {


    @Test
    public void test(){
        List list= Arrays.asList(
                new UserInfo("张三", 21, 1, "描述张三"),
                new UserInfo("李四", 22, 0, "描述李四"),
                new UserInfo("王五", 23, 1, "描述王五"),
                new UserInfo("赵六", 24, 1, "描述赵六")
        );
//        System.out.println("[toJSONString] - "+ JSONArray.toJSONString(list));
//        List<UserInfo> userInfoList=JSONArray.parseArray(JSONArray.toJSONString(list),UserInfo.class);
//        System.out.println("[userInfoList] - "+JSONArray.toJSONString(userInfoList));


        String list2="[{\"fare\":0,\"remark\":\"\",\"priceId\":10150,\"mount\":1,\"passwordVal\":\"\",\"skuId\":100011715408,\"addressId\":2},{\"fare\":0,\"remark\":\"\",\"priceId\":9669,\"mount\":1,\"skuId\":5047817,\"addressId\":2}]";
//        List<JSONObject> jsonObjectList=JSONArray.parseArray(list2,JSONObject.class);
//        System.out.println("[jsonObjectList] - "+JSONArray.toJSONString(jsonObjectList));
//        for (JSONObject obj:jsonObjectList) {
//            System.out.println("[fare] - "+obj.getIntValue("fare"));
//            System.out.println("[remark] - "+obj.getString("remark"));
//            System.out.println("[priceId] - "+obj.getInteger("priceId"));
//            System.out.println("[mount] - "+obj.getInteger("mount"));
//            System.out.println("[passwordVal] - "+obj.getString("passwordVal"));
//            System.out.println("[skuId] - "+obj.getLong("skuId"));
//            System.out.println("[addressId] - "+obj.getIntValue("addressId"));
//            System.out.println("================================");
//        }

        List<WsOrder> jsonObjectList=JSONArray.parseArray(list2,WsOrder.class);
        System.out.println("[jsonObjectList] - "+JSONArray.toJSONString(jsonObjectList));
        for (WsOrder wsOrder:jsonObjectList) {
            System.out.println("[wsOrder] - "+JSONObject.toJSONString(wsOrder));
            System.out.println("================================");
        }
    }


}
