/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2020-06-16 19:38:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>E-clean > 활동지역선택 > 서울특별시</title>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t* {\r\n");
      out.write("\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tlist-style: none;\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t\twidth: 1400px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\theader {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.flex {\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.flex > *:first-child {\r\n");
      out.write("\t\t\tmargin-left: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.flex > *:last-child {\r\n");
      out.write("\t\t\tmargin-right: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.flex-column {\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t\tflex-direction: column;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.flex-column > div {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.align-center {\r\n");
      out.write("\t\t\talign-items: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.justify-center {\r\n");
      out.write("\t\t\tjustify-content: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\ta {\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.logo {\r\n");
      out.write("\t\t\tfont-size: 48px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #4caf50;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.inner {\r\n");
      out.write("\t\t\tposition:relative;\r\n");
      out.write("\t\t\tdisplay:table-cell;\r\n");
      out.write("\t\t\tvertical-align: middle;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tjustify-content: flex-end;\r\n");
      out.write("\t\t\tfont-size: large;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tbutton::-moz-focus-inner, input::-moz-focus-inner{\r\n");
      out.write("\t\t\tborder: 0;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tmargin-right: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.link-box {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t\tjustify-content: flex-end;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.link-box > div {\r\n");
      out.write("\t\t\tmargin-right: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.link-box a {\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: #666;\r\n");
      out.write("\t\t\tborder: 1px solid #ccc;\r\n");
      out.write("\t\t\tpadding: 2px 5px;\r\n");
      out.write("\t\t\tborder-radius: 3px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tnav a {\r\n");
      out.write("\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tnav a:hover {\r\n");
      out.write("\t\t\tcolor: #2196f3;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#main > div {\r\n");
      out.write("\t\t\twidth: 50%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t#main .left-box {\r\n");
      out.write("\t\t\tflex-wrap: wrap;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .left-box .box {\r\n");
      out.write("\t\t\twidth: 50%;\r\n");
      out.write("\t\t\theight: 200px;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t\talign-items: center;\r\n");
      out.write("\t\t\tjustify-content: center;\r\n");
      out.write("\t\t\tfont-size: 30px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\ttransition: .3s;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .left-box .box:hover {\r\n");
      out.write("\t\t\topacity: .7;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .step {\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tleft: 20px;\r\n");
      out.write("\t\t\ttop: 15px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .box1 {\r\n");
      out.write("\t\t\tbackground: #BBDBA5;\r\n");
      out.write("\t\t\tfont-family:inherit;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .box2 {\r\n");
      out.write("\t\t\tbackground: #FCA25C;\r\n");
      out.write("\t\t\tfont-family:inherit;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .box3 {\r\n");
      out.write("\t\t\tbackground: #ACC2E8;\r\n");
      out.write("\t\t\tfont-family:inherit;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .box4 {\r\n");
      out.write("\t\t\tbackground: #E2BBEA;\r\n");
      out.write("\t\t\tfont-family:inherit;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .board {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 300px;\r\n");
      out.write("\t\t\tbackground: #2F544C;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .right-box {\r\n");
      out.write("\t\t\twidth: 50%;\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\tbackground: rgba(0, 0, 0, 0.5);\r\n");
      out.write("\t\t\tanimation:box 4s steps(9) infinite;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .board-box {\r\n");
      out.write("\t\t\twidth: 50%;\r\n");
      out.write("\t\t\theight: 100%;\r\n");
      out.write("\t\t\toverflow-y: scroll;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .board-box .title {\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tpadding: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#main .bottom-box {\r\n");
      out.write("\t\t\theight: 100%;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tposition:absolute;\r\n");
      out.write("\t\t\tbottom:0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main .item {\r\n");
      out.write("\t\t\tpadding-left: 20px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t\theight: 30px;\r\n");
      out.write("\t\t\tline-height: 30px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t::-webkit-scrollbar {\r\n");
      out.write("\t\t\tdisplay: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.controller {\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\tbottom: 30px;\r\n");
      out.write("\t\t\tleft: 50%;\r\n");
      out.write("\t\t\ttransform: translateX(-50%);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.controller .button {\r\n");
      out.write("\t\t\twidth: 15px;\r\n");
      out.write("\t\t\theight: 15px;\r\n");
      out.write("\t\t\tborder-radius: 50%;\r\n");
      out.write("\t\t\tbackground: white;\r\n");
      out.write("\t\t\tmargin-right: 20px;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t* {\r\n");
      out.write("\t\t\t/* margin => 박스 겉으로 미는 것 */\r\n");
      out.write("\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t/* padding => 박스 안으로 미는 것 */\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tlist-style: none;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* box-sizing: border-box; => 테두리와 패딩을 안쪽으로 효과주는 것 */\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t\tfont-family: \"맑은 고딕\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#menu {\r\n");
      out.write("\t\t\t/* width => 박스 가로 사이즈 */\r\n");
      out.write("\t\t\twidth: 300px;\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t\tflex-direction: column;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.menu {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t/* padding => 위 오른쪽 아래 왼쪽 순으로 값 지정 */\r\n");
      out.write("\t\t\tpadding: 10px 0 10px 20px;\r\n");
      out.write("\t\t\t/* 밑줄 제거 */\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t/* 애니메이션 재생 시간 */\r\n");
      out.write("\t\t\ttransition: .1s;\r\n");
      out.write("\t\t\t/* 배경 색 */\r\n");
      out.write("\t\t\tbackground: #f3f3f3;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* 마우스 호버 시 */\r\n");
      out.write("\t\t.menu:hover {\r\n");
      out.write("\t\t\tbackground: #2196f3;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tpadding: 15px 0 15px 20px;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t section { \r\n");
      out.write("\t\t \tbackground-image: url(/image/항강.jpg);\r\n");
      out.write("\t\t \tbackground-size:cover;\r\n");
      out.write("\t\t \tbackground-attachment: fixed;\r\n");
      out.write("\t\t \tdisplay:block;\r\n");
      out.write("\t\t \twidth: 100%;\r\n");
      out.write("\t\t \theight: 3800px; \r\n");
      out.write("\t\t \tcolor:#ffffff; \r\n");
      out.write("\t\t \ttext-align: center; \r\n");
      out.write("\t\t \tpadding-top:170px; \r\n");
      out.write("\t\t } \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t section h1 { \r\n");
      out.write("\t\t \tfont-size: 2.5em;\r\n");
      out.write("\t\t } \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t section h1 { \r\n");
      out.write("\t\t \tposition: relative; \r\n");
      out.write("\t\t \tz-index:1000; /*맨 앞으로 나오도록 함*/ \r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"link-box\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"login.jsp\">로그인</a>\r\n");
      out.write("\t\t\t<a href=\"join.jsp\">회원가입</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<header class=\"flex align-center\">\r\n");
      out.write("\t\t<a class=\"logo\" href=\"main.jsp\">E-clean</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div align=\"right\">\r\n");
      out.write("\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t<a href=\"info.jsp\">E-clean 소개</a> &nbsp;&nbsp;\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"text-align:left\">\r\n");
      out.write("\t\t\t<span style=\"color:#4caf50; font-size:20px;\">\r\n");
      out.write("\t\t\t\t<b>깨끗한 세상 만들기    |  Environment cleanup volunteer activities</b>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t<hr style=\"border: solid 1px green; width:100%;\"> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\t<section> \r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:155px; \"></div> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"Seoul.jsp\">서울특별시<br>사이트선택</a></h1>  \r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:700px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"https://www.1365.go.kr/vols/P9210/partcptn/timeCptn.do\">1365자원봉사포털</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:1250px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"https://www.youth.go.kr/youth/dvl/ey/vlntwkAct/vlntwkActRcritLstForm.yt?sort=&order=&page=1&rows=&kProgrmSn=&nas.cmm.token.html.TOKEN=9564aac02ea489387306796ac90c7e64&sDetailcnCode=&sActCtprvnCode=020001&sActSignguCode=&sAcdmcrCode=&sActDateSeCode=all&sActStartDate=&sActEndDate=&sFcltyGrpAt=All&sGrpNm=&sFcltyGrpSn=&sProgrmNm=%ED%99%98%EA%B2%BD&curMenuSn=434\">청소년자원봉사 Dovol</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:1800px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"https://www.vms.or.kr/partspace/recruit.do?area=0101&areagugun=&acttype=&status=1&sttdte=2019-05-21&enddte=2019-06-20&termgbn=&searchType=title&searchValue=%ED%99%98%EA%B2%BD&page=1\">사회복지인증시스템(Vms)</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t   \r\n");
      out.write("\t   <div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:2350px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"http://www.v1365.or.kr/search/search.php?search_top=%ED%99%98%EA%B2%BD\">한국중앙자원봉사센터</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:2900px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"http://www.greenkorea.org/\">녹색연합</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"background-color:rgba(0, 0, 0, 0.5); /*살짝 투명한 검정으로 배경색*/\r\n");
      out.write("\t\t \twidth: 1400px; \r\n");
      out.write("\t\t \theight:450px; \r\n");
      out.write("\t\t \tposition: absolute; /*다른 요소들 위로 겹쳐질 수 있게함*/ \r\n");
      out.write("\t\t \ttop:3450px; \r\n");
      out.write("\t\t \ttext-align: center;\r\n");
      out.write("\t\t \tpadding-top:170px;\r\n");
      out.write("\t\t \tfont-size: 1.3em; \"> \r\n");
      out.write("\t\t<h1><a style=\"color:white;\" href=\"local.jsp\">다른지역선택하기</a></h1>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
