/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-08-21 19:32:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/programacao%20if/site%20matérias/prjModulo8/prjModulo81/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/prjModulo8/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1631274532000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Página de login</title>\r\n");
      out.write("    <!-- fizemos o css em um arquivo separado, porém ele não estava sendo chamado após a configuração do filter,\r\n");
      out.write("    	portanto fizemos dentro do jsp.\r\n");
      out.write("     -->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    	*{\r\n");
      out.write("		    padding: 0;\r\n");
      out.write("		    margin: 0;\r\n");
      out.write("		    box-sizing: border-box;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		body {\r\n");
      out.write("		    color: #000;\r\n");
      out.write("		    overflow-x: hidden;\r\n");
      out.write("		    height: 100vh;\r\n");
      out.write("		    background-image: linear-gradient(to right, #D500F9, #FFD54F);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#nome, #email, #senha{\r\n");
      out.write("		    background-color: #F3E5F5;\r\n");
      out.write("		    border-radius: 50px;\r\n");
      out.write("		    padding: 12px 15px 12px 15px;\r\n");
      out.write("		    width: 100%;\r\n");
      out.write("		    box-sizing: border-box;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		    border: 1px solid #F3E5F5;\r\n");
      out.write("		    font-size: 16px;\r\n");
      out.write("		    color: #000;\r\n");
      out.write("		    font-weight: 400;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#nome:focus, #email:focus, #senha:focus{\r\n");
      out.write("		    -moz-box-shadow: none;\r\n");
      out.write("		    -webkit-box-shadow: none;\r\n");
      out.write("		    box-shadow: none;\r\n");
      out.write("		    border: 1px solid #D500F9;\r\n");
      out.write("		    outline-width: 0;\r\n");
      out.write("		    font-weight: 400;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.form-control-label {\r\n");
      out.write("		    font-size: 12px;\r\n");
      out.write("		    margin-left: 15px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.msg-info {\r\n");
      out.write("		    padding-left: 15px;\r\n");
      out.write("		    margin-bottom: 30px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.btn-color {\r\n");
      out.write("		    border-radius: 50px;\r\n");
      out.write("		    color: #fff;\r\n");
      out.write("		    background-image: linear-gradient(to right, #FFD54F, #D500F9);\r\n");
      out.write("		    padding: 15px;\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		    margin-top: 40px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.btn-color:hover {\r\n");
      out.write("		    color: #fff;\r\n");
      out.write("		    background-image: linear-gradient(to right, #D500F9, #FFD54F);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#btn2 {\r\n");
      out.write("		    width: 150px;\r\n");
      out.write("		    box-sizing: border-box;\r\n");
      out.write("		    border-radius: 50px;\r\n");
      out.write("		    color: #fff;\r\n");
      out.write("		    background-image: linear-gradient(to right, #575757,#151615);\r\n");
      out.write("		    padding: 15px;\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#btn2:hover {\r\n");
      out.write("		    box-sizing: border-box;\r\n");
      out.write("		    border-radius: 50px;\r\n");
      out.write("		    color: #fff;\r\n");
      out.write("		    background-image: linear-gradient(to right, #151615,#575757);\r\n");
      out.write("		    padding: 15px;\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.sm-text {\r\n");
      out.write("		    font-size: 15px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		@media screen and (max-width: 992px) {\r\n");
      out.write("		\r\n");
      out.write("		    .card1 {\r\n");
      out.write("		        width: 100%;\r\n");
      out.write("		        padding: 40px 30px 10px 30px;\r\n");
      out.write("		        margin: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		    .card2 {\r\n");
      out.write("		        width: 100%;\r\n");
      out.write("		        margin: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		    .right {\r\n");
      out.write("		        margin-top: 100px;\r\n");
      out.write("		        margin-bottom: 100px;\r\n");
      out.write("		    }\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		@media screen and (max-width: 668px) {\r\n");
      out.write("		\r\n");
      out.write("		    .container {\r\n");
      out.write("		        padding: 10px;\r\n");
      out.write("		        margin: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		    .card2 {\r\n");
      out.write("		        padding: 50px;\r\n");
      out.write("		        margin: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		    .right {\r\n");
      out.write("		        margin-top: 50px;\r\n");
      out.write("		        margin-bottom: 50px;\r\n");
      out.write("		        margin: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <section id=\"login\" class=\"container\" style=\"margin-top: 7vh;\">\r\n");
      out.write("      <form action=\"login\" method=\"post\" style=\"margin-left: auto; margin-right: auto;\">\r\n");
      out.write("        <div class=\"container px-4 py-5 mx-auto row\">\r\n");
      out.write("            <div class=\"card card1 row\" style=\"width: 400px; margin: auto; margin-top: 3vh;\">\r\n");
      out.write("                <div class=\"row justify-content-center my-auto\" style=\"padding: 30px, 15px;\">\r\n");
      out.write("                    <div class=\"col-md-8 col-10 my-5\">\r\n");
      out.write("                        <h4 class=\"mb-5 text-center heading display-6\">Bem vindo!</h4>\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write(" 	                       <h6 class=\"msg-info\" style=\"font-weight: 400;\">Entre com a sua conta</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <!-- traduzindo o if abaixo: sera feito um teste que ira verificar se contem algum conteudo dentro do \"mensagem1\"\r\n");
      out.write("                             se tiver algum dado dentro, ele vai mostrar a div com a mensagem,\r\n");
      out.write("                             por outro lado se o \"mensagem1\" estiver vazio ele nao vai mostrar a div com a mensagem -->\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <!--\r\n");
      out.write("                          //o codigo abaixo verifica se o email nao esta vazio, e se ele nao estiver vazio apos voltar pro index\r\n");
      out.write("                          //ele tera um redirect de volta para o site das materias, por outro lado se\r\n");
      out.write("                          //o email realmente estiver vazio ele continuara no index.\r\n");
      out.write("                        -->\r\n");
      out.write("                        \r\n");
      out.write("                        <!--  \r\n");
      out.write("                           ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f1_reused = false;
      try {
        _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f1.setParent(null);
        // /index.jsp(165,27) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty email}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
        if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("	                           ");
//response.sendRedirect("materias"); 
            out.write("\r\n");
            out.write("                           ");
            int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
        _jspx_th_c_005fif_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
      }
      out.write("\r\n");
      out.write("                        -->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                        	<label class=\"form-control-label text-muted\">Email</label>\r\n");
      out.write("                        	<input type=\"email\" id=\"email\" name=\"email\" placeholder=\"email@gmail.com\" class=\"form-control\" style=\"background-color: rgb(231, 222, 222);\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                        	<label class=\"form-control-label text-muted\">Senha</label>\r\n");
      out.write("                        	<input type=\"password\" id=\"senha\" name=\"senha\" placeholder=\"senha\" class=\"form-control\" style=\"background-color: rgb(231, 222, 222);\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <label class=\"form-control-label text-muted\" style=\"margin-top: 20px;\">Não tem uma conta ? cadastre uma nova <a href=\"usuario/cadastro.jsp\">aqui</a></label>\r\n");
      out.write("                        <div class=\"row justify-content-center my-3 px-3\"> \r\n");
      out.write("                        <button type=\"submit\" class=\"btn-block btn-color\" style=\"margin-top: 15px;\">Entrar</button>\r\n");
      out.write("                                     \r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>        \r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /index.jsp(152,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mensagem2}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	                        <div class=\"alert alert-danger text-center\" role=\"alert\">\r\n");
          out.write("	                        	");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagem2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("	                        </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}