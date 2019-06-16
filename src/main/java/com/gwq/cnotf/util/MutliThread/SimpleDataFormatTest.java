package com.gwq.cnotf.util.MutliThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 09:57 2019/06/10
 */
public class SimpleDataFormatTest extends Thread{

    private SimpleDateFormat sdf;
    private String dataString;


    public SimpleDataFormatTest (SimpleDateFormat sdf, String dataString) {
        this.sdf = sdf;
        this.dataString = dataString;
    }

    @Override
    public void run() {
        getTransString();
    }

    private void getTransString () {
        try {
            synchronized (SimpleDataFormatTest.class) {
                Date date = sdf.parse(dataString);
                String transString = sdf.format(date).toString();
//                if (!dataString.equals(transString)) {
                    System.out.println(Thread.currentThread().getName() + "：原来日期：" + dataString + ",转换后为：" +
                            transString);
//                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
