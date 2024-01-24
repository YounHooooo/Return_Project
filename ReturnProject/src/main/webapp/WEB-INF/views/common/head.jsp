<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="description" content="">
   <meta name="author" content="Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들">
   <meta name="generator" content="Hugo 0.104.2">
   <title>Sticky Footer Navbar Template · Bootstrap v5.2</title>

   <link rel="canonical" href="https://getbootstrap.kr/docs/5.2/examples/sticky-footer-navbar/">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

   <!-- Favicons -->
	<link rel="apple-touch-icon" href="/docs/5.2/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
	<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
	<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
	<link rel="manifest" href="/docs/5.2/assets/img/favicons/manifest.json">
	<link rel="mask-icon" href="/docs/5.2/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
	<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon.ico">
	
	<meta name="theme-color" content="#712cf9">
	<!-- boardList.css 파일 불러오기 -->
  	<link href="../../resources/css/boardList.css" rel="stylesheet">
  
	<!-- jQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
	<!-- Sweetalert2 -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css">
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.js"></script>
	
	<script src="/resources/js/common/alert.js"></script>
	<script>
		/* const msg = "로그인 되었습니다."; */
		const msg='<%= request.getAttribute("msg") %>';
		const status='<%= request.getAttribute("status") %>';
		
		if(msg !== "null" && status !== "null") {
			$(document).ready(function() {
				alertFunc(msg, status);
			})
		}
	</script>
  
  
  
  
  