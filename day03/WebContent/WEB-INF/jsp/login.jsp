<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/vue.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/axios-0.18.0.js"></script>

</head>
<body>
<div id ="did">
	<span v-text="info"></span>
	学生姓名:<input type="text" v-model="user.uname"><br>
	登录密码:<input type="password" v-model="user.pwd"><br>
	<input type="button" value="登录" @click="login">
	<input type="button" value="注册" @click="regist">
</div>
<script type="text/javascript">
	var div = new Vue({
		el:"#did",
		data:{
			user:{
				uname:'',
				pwd:''
			},
			info:'',
			ninfo:'',
			pinfo:''
		},
		methods:{
			login(){
				if(this.user.uname.length>0){
					if(this.user.pwd.length>0){
						axios.post("${pageContext.request.contextPath}/login.do",this.user).then(function(res){
							if(res.data>0){
								location.href="${pageContext.request.contextPath}/toShow.do"
							}else{
								div.info="用户名密码错误！"
							}
						})	
					}else{
						this.pinfo="密码不能为空!"
					}
				}else{
					this.ninfo="姓名不能为空!"
				}
				
			},
			toRegist(){
				axios.post("${pageContext.request.contextPath}/login.do",this.user)
			}
		}
	})

</script>
</body>
</html>