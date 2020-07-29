<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>카카오 API 통신</h1>
<hr>
<input type="text" id="query">

<button onclick="kakaoBookApi()">카카오 api 통신</button>

<script type="text/javascript">
	function kakaoBookApi(){
		var xhr = new XMLHttpRequest();
		var query = document.querySelector("#query").value
// 		var query = document.getElementById("query").value;
		
		//시작줄 작성
		xhr.open('GET' , "https://dapi.kakao.com/v3/search/book?query=" + query);
		
		//헤더 설정
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.setRequestHeader("Authorization" , "KakaoAK 1ca6991f0050ec279260ee16b1c8d29d");
		
		//통신 시작
		xhr.send();
		
		xhr.addEventListener("load",function(){
			console.dir(xhr.response);
		})
		
	}
</script>




</body>
</html>