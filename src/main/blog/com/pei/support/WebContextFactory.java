package com.pei.support;

/**
 * ThreadLocal的作用是提供线程内的局部变量，
 * 这种变量在线程的生命周期内起作用，
 * 减少同一个线程内多个函数或者组件之间一些公共变量的传递的复杂度。
 */
public class WebContextFactory {

  private static final ThreadLocal<WebContext> WEB_CONTEXT_HOLDER = new ThreadLocal<WebContext>();

  private WebContextFactory(){
  }

  public static WebContext get(){
    return WEB_CONTEXT_HOLDER.get();
  }

  public static void set(WebContext context){
    WEB_CONTEXT_HOLDER.set(context);
  }

  public static void remove(){
    WEB_CONTEXT_HOLDER.set(null);
  }

}