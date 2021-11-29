package com.javaex.ex09;

public class StringUtilApp {

    public static void main(String[] args) {
    	
        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        //strArray 012 는 각각 슈퍼맨배트맨스파이더맨
           
    	//concatString이라는 메소드를 이용한값이 resultStr값이다.
        //근데 그 메소드가 strArray값을 받아서 합치고, 출력까지 하는거.
        String resultStr = StringUtil.concatString(strArray);
        
        
        System.out.println("결과 문자열: " + resultStr);
    }

}
