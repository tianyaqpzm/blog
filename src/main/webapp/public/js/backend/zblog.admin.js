if(typeof com=="undefined"){
  var zblog={};
}

//增加命名空间  使用方法：zblog.register('bbb.ccc','admin.zhou');
//命名空间有助于减少程序中所需要的全局变量的数量，并且同时有助于避免命名冲突或过长的名字前缀。

// 在添加这个“命名空间”的时候，我们有可能覆盖全局空间中的同名对象。
// 因此我们需要在声明命名空间前进行检查，保证全局空间的安全：
// var MYNAMESPACE = MYNAMESPACE || {};
// 若全局空间中已有同名对象，则不覆盖该对象；否则创建一个新的命名空间
zblog.register =function(){
  var result={},temp;
  for(var i=0;i<arguments.length;i++){
	 temp=arguments[i].split(".");
	 // ?
	 result=window[temp[0]]=window[temp[0]] || {};
	 for(var j=0;j<temp.slice(1).length;j++){
	   result=result[temp[j+1]]=result[temp[j+1]] || {};
	  }
   }
  
  return result;
}

zblog.getDomainLink=function(path){
  return window.location.protocol+"//"+window.location.host+"/backend/"+path;
}

zblog.newCsrf=function(){
  var csrfValue = (Math.random()+"").substring(2);
  /* 此处token值可以放在cookie中 */
  $.cookie("x-csrf-token", csrfValue, {path:"/backend"});
  return csrfValue;
}

$(document).ajaxSend(function(event, xhr, settings){
  if(!/^(GET|HEAD|OPTIONS|TRACE)$/.test(settings.type)){
    xhr.setRequestHeader("CSRFToken", zblog.newCsrf());
  }
});

$(function(){
  $("form").each(function(index){
    var csrfValue= zblog.newCsrf();
    var csrfInput=$(this).find(":input[name='CSRFToken']");
    if(csrfInput.length>0){
      csrfInput.val(csrfValue);
    }else{
      $(this).append("<input type='hidden' name='CSRFToken' value='"+csrfValue+"' />");
    }
  }); 
});
