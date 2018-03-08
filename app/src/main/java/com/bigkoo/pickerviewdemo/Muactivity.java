package com.bigkoo.pickerviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.bigkoo.pickerviewdemo.bean.ComTypeMod;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Muactivity extends AppCompatActivity {
    ComTypeMod comTypeMod;
    ArrayList<ComTypeMod.RowsBean> arrayLists = new ArrayList<>();
    ArrayList<ComTypeMod.RowsBean> arrayListss = new ArrayList<>();
    private  ArrayList<String> options1Items = new ArrayList<>();
    private  ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
    private  ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_basepickerview);
        getArray();
    }
    public  void getArray() {
        String url = "";
//        myhttpRequest.request("http://42.123.116.244:8081/ieam-activiti/componentTypeInspection4Ipad.do?", "qryCompTypeList", "POST").toString();
        String response =  new GetJsonDataUtil().getJson(Muactivity.this,"json.json");
        comTypeMod = JSON.parseObject(response, ComTypeMod.class);
        arrayLists.addAll(comTypeMod.getRows());
        arrayListss.addAll(JSON.parseObject(response, ComTypeMod.class).getRows());
        for (int i = 0; i < arrayLists.size(); i++) {
            ArrayList<String> CityList = new ArrayList<>();//该省的城市列表（第二级）
            ArrayList<ArrayList<String>> Province_AreaList = new ArrayList<>();//该省的所有地区列表（第三极）
            options1Items.add(arrayLists.get(i).getText());
            for (int c = 0; c < arrayLists.get(i).getChildren().size(); c++) {
                if (arrayLists.get(i).getChildren().get(c).getStructureType().equals("lsq")){
                    String CityName = arrayLists.get(i).getChildren().get(c).getText();
                    CityList.add(CityName);//添加城市
                    ArrayList<String> City_AreaList = new ArrayList<>();//该城市的所有地区列表
                    for (int d = 0; d < arrayLists.get(i).getChildren().get(c).getChildren().size(); d++) {//该城市对应地区所有数据
                        String AreaName = arrayLists.get(i).getChildren().get(c).getChildren().get(d).getText();
                        City_AreaList.add(AreaName);//添加该城市所有地区数据
                    }
                    Province_AreaList.add(City_AreaList);//添加该省所有地区数据
                }else {
                    arrayListss.get(i).getChildren().remove(c);
                }
            }
            /**
             * 添加城市数据
             */
            options2Items.add(CityList);

            /**
             * 添加地区数据
             */
            options3Items.add(Province_AreaList);
        }
        System.out.println(arrayListss.size()+"/"+arrayLists.size());
        Iterator<ComTypeMod.RowsBean> lter=  arrayLists.iterator();
        while (lter.hasNext()){
            ArrayList<String> CityList = new ArrayList<>();//该省的城市列表（第二级）
            ArrayList<ArrayList<String>> Province_AreaList = new ArrayList<>();//该省的所有地区列表（第三极）
            options1Items.add(lter.next().getText());
            while (lter.next().getChildren().iterator().hasNext()){
                if (lter.next().getChildren().iterator().next().getStructureType().equals("lsq"));
            }

        }
    }
}
