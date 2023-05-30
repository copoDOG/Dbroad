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
	
	section{ /*이미지*/
	margin: 50px;
	margin-top:0px;
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
	 
	.slides {display:none;} /* 이미지 슬라이드 */
	
</style>
<!-- style -->
  
</head> 
   
<!-- 팝업창  -->  
<body onload="window.open('pop.jsp','pop','width=300px, height=400px, left=10px, top=184px, toolbar=0, status=yes, menubars=0, scrollbars=0, resizable=0, location=0, directories=0')">
<!-- 팝업창 --> 
        
<!-- header -->	
<header>
	<h1> <!-- Main 로고 -->
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
<div style="max-width:100%">

	<a href="https://web.dongguk.ac.kr/mbs/kr/index.jsp">
  	<img class="slides" src="image/동국a.jpg" style="width:100%"> <!-- 학교홈페이지 -->
  	</a>
  	
  	<a href="http://www.sejonghakdang.org/sjcu/home/main.do">
  	<img class="slides" src="image/세종대왕a.jpg" style="width:100%"> <!-- 세종학당 -->
  	</a>
  	
  	<a href="intKor.jsp">
  	<img class="slides" src="image/남산타워a.jpg" style="width:100%"> <!-- 한글 입문 -->
  	</a>
  	
  	<a href="korEdu.jsp">
  	<img class="slides" src="image/한복a.jpg" style="width:100%"> <!-- 한국교육원 -->
  	</a>
  	 
</div>

<!-- img script -->
<script>
var myIndex = 0;
carousel(); //캐러셀

function carousel() {
  var i;
  //이미지들 불러오기
  var x = document.getElementsByClassName("slides"); 
  //for문으로  이미지들 none 안보이게 하기
  for (i = 0; i < x.length; i++) { 
    x[i].style.display = "none";  
  }
  //myIndex 값을 올려 다음 이미지가 나오게 하기
  myIndex++;
  //myIndex 값이 초과했을때 처음 이미지로 초기화 하기
  if (myIndex > x.length) {myIndex = 1}
  //배열은 0부터 시작  -> -1하여 해당 이미지가 보이게 해줌
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 3000); //setTimeout 3초후에 또 다시 실행
} //결국 3초마다 무한 반복되는 함수
</script>
<!-- img script --> 

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
