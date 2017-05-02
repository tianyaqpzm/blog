package com.pei.util;

import com.pei.Constants;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlUtil{

  public static String encode(String url){
    try{
      return URLEncoder.encode(url, Constants.ENCODING_UTF_8.name());
    }catch(UnsupportedEncodingException e){
      return url;
    }
  }

  public static String decode(String url){
    try{
      return URLDecoder.decode(url, Constants.ENCODING_UTF_8.name());
    }catch(UnsupportedEncodingException e){
      return url;
    }
  }

}
