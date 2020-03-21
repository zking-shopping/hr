function dateToStr(datetime,dateformat){
	var year = parseInt(datetime.year)+1900;
	var month = datetime.month+1;//js从0开始取 
	var date = datetime.date; 
	var hour = datetime.hours; 
	var minutes = datetime.minutes; 
	var second = datetime.seconds;
	
	if(month<10){
		month = "0" + month;
	};
	if(date<10){
		date = "0" + date;
	};
	if(hour <10){
		hour = "0" + hour;
	};
	if(minutes <10){
	 	minutes = "0" + minutes;
	};
	if(second <10){
	 	second = "0" + second ;
	};
	 
	var time = "";
	if(dateformat=="1"){
		time = year+"-"+month+"-"+date;
	}else if(dateformat=="2"){
		time = year+"-"+month+"-"+date+" "+hour+":"+minutes+":"+second;
	};
	
	return time;
};
function getNowDate(dateformat){
	//myDate.getYear();        //获取当前年份(2位)
	//myDate.getFullYear();    //获取完整的年份(4位,1970-????)
	//myDate.getMonth();       //获取当前月份(0-11,0代表1月)
	//myDate.getDate();        //获取当前日(1-31)
	//myDate.getDay();         //获取当前星期X(0-6,0代表星期天)
	//myDate.getTime();        //获取当前时间(从1970.1.1开始的毫秒数)
	//myDate.getHours();       //获取当前小时数(0-23)
	//myDate.getMinutes();     //获取当前分钟数(0-59)
	//myDate.getSeconds();     //获取当前秒数(0-59)
	//myDate.getMilliseconds();    //获取当前毫秒数(0-999)
	//myDate.toLocaleDateString();     //获取当前日期
	//var mytime=myDate.toLocaleTimeString();     //获取当前时间
	//myDate.toLocaleString( );        //获取日期与时间
	var myDate = new Date();
	var year = myDate.getFullYear();
	var month = myDate.getMonth()+1;
	var date = myDate.getDate(); 
	var hour = myDate.getHours();
	var minutes = myDate.getMinutes(); 
	var second = myDate.getSeconds();
	if(month<10){
		month = "0" + month;
	};
	if(date<10){
		date = "0" + date;
	};
	if(hour <10){
		hour = "0" + hour;
	};
	if(minutes <10){
	 	minutes = "0" + minutes;
	};
	if(second <10){
	 	second = "0" + second ;
	};
	 
	var time = "";
	if(dateformat=="1"){
		time = year+"-"+month+"-"+date;
	}else if(dateformat=="2"){
		time = year+"-"+month+"-"+date+" "+hour+":"+minutes+":"+second;
	};
	
	return time;
};