package com.yeehom.ecommerseminiprog.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Created by kongxq on 2017/5/21.
 */
public class JsonUtil<T> {

    private Object obj;

    public JsonUtil(Object obj)
    {
        this.obj = obj;
    }

    public static String Serialize(Object aPojo)
    {
        return new Gson().toJson(aPojo);
    }

    public T Deserialize(String json)
    {
        try
        {
            obj =new Gson().fromJson(json,obj.getClass());

            if(obj==null)
                return  null;
        }
        catch (JsonSyntaxException e)
        {
            e.printStackTrace();
        }
        return (T)obj;
    }

}
