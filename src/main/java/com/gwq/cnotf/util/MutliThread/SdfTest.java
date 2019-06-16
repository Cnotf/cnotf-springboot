package com.gwq.cnotf.util.MutliThread;


import java.text.SimpleDateFormat;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 10:10 2019/06/10
 */
public class SdfTest {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDataFormatTest[] simpleDataFormatTests = new SimpleDataFormatTest[5];
        String[] strings = new String[]{"2019-01-01", "2004-11-01", "2019-04-21", "2007-08-08", "2022-09-18"};
        for (int i = 0; i < 5; i++) {
            simpleDataFormatTests[i] = new SimpleDataFormatTest(simpleDateFormat, strings[i]);
        }
        for (int i = 0; i < 5; i++) {
            simpleDataFormatTests[i].start();
        }
    }
}