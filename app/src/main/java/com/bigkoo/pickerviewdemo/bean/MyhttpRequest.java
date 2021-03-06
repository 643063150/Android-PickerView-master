package com.bigkoo.pickerviewdemo.bean;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/9/4.
 */

public class MyhttpRequest {
    public Object request(String urlStr, String dataStr, String method) {

        // String tempData = URLEncoder.encode(dataStr);//

        byte[] data = dataStr.getBytes();
        URL url;
        try {
            url = new URL(urlStr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setConnectTimeout(5000);
            // 这是请求方式为POST
            conn.setRequestMethod(method);
            // 设置post请求必要的请求头
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");//
            conn.setRequestProperty("Content-Length", data.length + "");// 注意是字节长�?
            // 不是字符长度
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("contentType", "utf-8");

            if (method.equals("DELETE")) {
                if (conn.getResponseCode() == 200) {
                    return 1;
                } else {
                    return 0;
                }
            }

            conn.setDoOutput(true);// 准备写出
            conn.getOutputStream().write(data);// 写出数据
            if (conn.getResponseCode() == 200) {
                InputStream is = conn.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int len;
                while ((len = is.read(buf)) != -1) {
                    out.write(buf, 0, len);
                }
                String string = out.toString("UTF-8");
                out.close();
//                JSONObject jsonObject = new JSONObject(string);
                return string;
            } else {
                return null;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
