package com.yeehom.ecommerseminiprog.util;

import com.yeehom.ecommerseminiprog.entity.RegularEntity;
import com.yeehom.ecommerseminiprog.enums.RegType;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正則表達式
 * Created by kongxq on 2017/5/28.
 */
public class Regular {

    //微信
    private String weiXin ="^[a-zA-Z]{1}[-_a-zA-Z0-9]{5,19}+$";
    //手機
    private String phone = "^0?(13[0-9]|15[012356789]|17[013678]|18[0-9]|14[57])[0-9]{8}$";
    //郵箱
    private String email = "^[a-z0-9]+([._\\\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";

    public static boolean Analyze(Enum type,String content){
        boolean isMate = false;
        try {
            Class cls=Class.forName("com.yeehom.ecommerseminiprog.util.Regular");
            Field[] field = cls.getDeclaredFields();

            for (Field f:field)
            {
                if(f.getName().toLowerCase().equals(type.name().toLowerCase()))
                {
                    Object newInstance = cls.newInstance();
                    f.setAccessible(true);
                    String regText = (String)f.get(newInstance);

                    Pattern pattern = Pattern.compile(regText);

                    Matcher mat = pattern.matcher(content);

                    isMate = mat.matches();
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return isMate;
    }

    public static RegularEntity Analyze(String content){
        if ("".equals(content)||content == null)
            return null;
        RegType re = getType(content);
        RegularEntity reg = new RegularEntity();
        if(re!=null)
        {
            reg.setMatch(Analyze(re,content));
        }
        reg.setMatchContent(content);
        reg.setMatchType(re);
        return reg;
    }

    public static RegType getType(String content)
    {

        RegType re  = null;
        try {
            Class cls=Class.forName("com.yeehom.ecommerseminiprog.util.Regular");
            Field[] field = cls.getDeclaredFields();
            Object newInstance = cls.newInstance();
            for (Field f:field)
            {

                f.setAccessible(true);
                String regText = (String)f.get(newInstance);

                Pattern pattern = Pattern.compile(regText);

                Matcher mat = pattern.matcher(content);
                if(mat.matches())
                {
                    String type = f.getName().toLowerCase();
                    re = RegType.valueOf(type.toUpperCase());
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return re;
    }

}
