<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body id="page-top">
    <!-- Page Wrapper -->
    <div id="wrapper">
    
    	<!-- Sidebar -->
    	<%@ include file="../../include/nav.jsp" %>
		<!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

			<div class="container-fluid">

	            <!-- Main Content -->
	            <div class="row" style="margin-top: 30px;">
	           		<div class="col-lg-12">
	           			<h1 class="h3 mb-2 text-gray-800" style="margin-left: 7px;">글 등록</h1>
	           		</div> 
	            </div>
	            
	            <div>
	            	<div class="col-lg-12">
	            		<div class="panel panel-default">
	            			<form role="form" action="/board/registerAction" method="post">
	            				<button type="submit" class="btn btn-primary" style="margin-top: 30px;">등록</button>
	            			
	            				<div class="form-group">
	            					<label>제목</label>
	            					<input class="form-control" name="TITLE" required>
	            				</div>
	            				
	            				<div class="form-group">
	            					<label>내용</label>
	            					<textarea class="form-control" rows="22" name="CONTENT" required></textarea>
	            				</div>
	            				
	            				<div class="form-group">
	            					<label>작성자</label>
	            					<input class="form-control" name="REG_ID" required>
	            				</div>
	            			</form>
	            		</div>
	            	</div>
	            </div>
            <!-- End of Main Content -->
            
            </div>

            <!-- Footer -->
            <%@ include file="../../include/footer.jsp" %>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Bootstrap core JavaScript-->
    <script src="/resources/vendor/jquery/jquery.min.js"></script>
    <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/resources/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/resources/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/resources/js/demo/chart-area-demo.js"></script>
    <script src="/resources/js/demo/chart-pie-demo.js"></script>

</body>
</html>