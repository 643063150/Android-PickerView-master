
在pickview的基础上做了修改  在不妨碍原有功能的基础上添加滚动停止的监听

```java
 pvCustomOptions.setOnStopListener(new OptionsPickerView.OnStopListener() {
            @Override
            public void stop() {
                int[] optionsCurrentItems = pvCustomOptions.getpos();
                int options1 = optionsCurrentItems[0];
                int options2 = optionsCurrentItems[1];
                int options3 = optionsCurrentItems[2];
               //最多三个options，你也可以在停止的滚动监听里直接返回就行
               });
```
