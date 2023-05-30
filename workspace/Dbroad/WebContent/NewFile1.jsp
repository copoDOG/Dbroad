<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">

<style>
.slides {display:none;}
</style>

</head>

<body>

<div style="max-width:500px">
  <img class="slides" src="image/동국a.jpg" style="width:100%">
  <img class="slides" src="image/세종대왕a.jpg" style="width:100%">
  <img class="slides" src="image/한복a.jpg" style="width:100%">
</div>

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

</body>
</html>