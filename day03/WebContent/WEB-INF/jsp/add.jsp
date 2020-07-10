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
<form id="fid" action="">
	姓名:<input type="text" v-model="stu.sname"><br>
	年龄:<input type="test" v-model="stu.age"><br>
	性别:<input type="radio" value="男" v-model="stu.sex">男
	<input type="radio" value="女" v-model="stu.sex">女<br>
	地址:<select v-model="stu.depid">
	<option v-for="dept in dlist" :value="dept.depid" v-text="dept.dname"></option>
	</select><br>
	生日:<input type="date" v-model="stu.birthday"><br>
	图片:<input type="file"><br>
	<input type="button" @click="add" value="添加">
</form>
<script type="text/javascript">
	var form =new Vue({
		el:"#fid",
		data:{
			dlist:[],
			stu:{}
		},
		created(){
			axios.post("${pageContext.request.contextPath}/findDept.do").then(function(res){
				form.dlist=res.data;
			})
		},
		methods:{
			add(){
				axios.post("${pageContext.request.contextPath}/addStu.do",form.stu).then(function(res){
					if(res.data>0){
						location.href="${pageContext.request.contextPath}/toShow.do"
						};
				})
				
				}
		}
	});
</script>
</body>
</html>