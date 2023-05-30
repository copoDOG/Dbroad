<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 동국대학교 Dbroad </title>
<!-- 파비콘  -->
<link type="img/x-icon" rel="icon" href="http://blogfiles.naver.net/20140310_181/rokpia0071_1394439345125aKwKu_PNG/%B5%BF%B1%B9%B4%EB%C7%D0%B1%B3-%B7%CE%B0%ED.png">
<!-- 파비콘  -->

<!-- style -->
<style>
	div {
    display: block;
	}
	
	header{ /* 헤더 */
	margin: 30px;
	width: auto;
	height: 53px;
	}
	
	#logo{ /*헤더로고*/
	width: 350px;
	height: 50px;
	position: relative;
        left: 15px;
	}
	
	h3 { /*헤더 nav*/
	position: relative;
        right: 85px;
        bottom: 70px;
	text-align: right;
	color: #a5a5a5; /* 짙은 회색 */ 
	}
	
	section{ /*section*/
	margin: 50px;
	margin-top:0px;
	margin-bottom:50px;
	}
	
	#div{ /* section div */
	border:1px solid black;
	}
	.box{ 			/* section 배경이미지 */
	width:1300px;
	height:600px;
	background-image:url(image/모음자음1.jpg);
	background-repeat:no-repeat; /* 배경이미지 반복취소 */
	background-position : center;
	background-size:contain; 	/* 배경이미지 비율유지 */
	} 
	 
	#img{	/*div eng/jap/chi/vet 버튼 이미지*/
		margin: 300px;
		margin-top:260px;
		margin-bottom:50px;
		margin-right:10px; 
	}
	 
	article{ /* 바로가기 링크 이미지*/
	margin: 20px;
	margin-top:30px;
	margin-bottom:10px;
	width:230px; height:200px;
	float:left;
	}
	
	body {
    height: auto;
    font-size: .90em;
    position: relative;
	}
	
	html, body {
    height: 100%;
    width: 100%;
    margin: 0;
    padding: 0;
    font-family: 'NanumGothic';
    line-height: 1.5;
    color: #090909;
	}
	
	
	
	footer {
	background-color: #333333; /* 배경 진한 회색 */
    text-align: center;
    padding: 25px 0 38px 0;
    color: #cecece;			   /* 글자 밝은 회색 */
    border-top: 3px solid #2f2f2f;
	}
	
	#footerSpan {
	color :#F79350; /*주황*/
	}
	
	address{
	font-style:unset; /* 기울기X */
	}
	
</style>
<!-- style -->

</head>
<body>

<!-- header -->	
<header>
	<h1>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="main.jsp" title="동국대학교 경주캠퍼스 Dbroad">
			<img id="logo" 
			src="image/Dlogo.JPG">
		</a>	
	</h1>
	<h3>Hangul education&nbsp;&nbsp;&nbsp;&nbsp;|
	&nbsp;&nbsp;&nbsp;&nbsp;ハングル きょうい &nbsp;&nbsp;&nbsp;&nbsp;| <!-- 일본어 -->
	&nbsp;&nbsp;&nbsp;&nbsp;韩文 敎育 &nbsp;&nbsp;&nbsp;&nbsp;|		 <!-- 중국어 -->
	&nbsp;&nbsp;&nbsp;&nbsp;chữ Hàn Quốc sự giáo dục</h3>			 <!-- 베트남 -->
</header>	
<!-- header -->

<!-- section -->
<section>

	<!-- article -->
	<article>
	
	<div align="left">
		<a href="https://www.studyinkorea.go.kr/ko/sub/college_info/room/allnew_koreanOnline.do">
  			<img src="image/Sika.JPG" style="width:200px; height:50px"> <!-- learn Korean -->
 		</a>
 		
	<Br><Br>
 	
 		<a href="https://www.howtostudykorean.com/">
  			<img src="image/howa.JPG" style="width:200px; height:50px"> <!-- how to study korean -->
 		</a>
	</div>
	
	</article>
	<!-- article -->
	
	<div id="div" class="box">
		<!-- 배경이미지 -->
	
	<div style="float:right; margin-right:150px; "id="img">
		<a href="eng.jsp">
  			<img src="image/engC.JPG"> <!-- eng -->
 		</a>
 		&nbsp;&nbsp;
 		<a href="jap.jsp">
  			<img src="image/japC.JPG"> <!-- jap -->
 		</a>
 		&nbsp;&nbsp;
 		<a href="chi.jsp">
  			<img src="image/chiC.JPG"> <!-- chi -->
 		</a>
 		&nbsp;&nbsp;
 		<a href="vet.jsp">
  			<img src="image/vetC.JPG"> <!-- vet -->
 		</a>
 	</div>
 	
	</div> 	
	
</section>
<!-- section -->

<!-- footer -->	
<footer> 
	<address>[38066]  경상북도 경주시 동대로 123 동국대학교 경주캠퍼스 
		<span>&nbsp;&nbsp;T.054-770-2114 &nbsp;&nbsp;F.054-770-2001</span>
	</address>
	<p>COPYRIGHT ⓒ&nbsp;&nbsp;<span id="footerSpan">DONGGUK UNIVERSITY 
	   GYEONGJU</span>&nbsp;&nbsp;COMPUTER ENGINEERING 20 Lee gyuwon.
	</p>	
</footer>
<!-- footer -->	

</body>
</html>